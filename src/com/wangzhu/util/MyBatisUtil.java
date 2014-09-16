package com.wangzhu.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private final static SqlSessionFactory SQL_SESSION_FACTORY;
	static {
		String resource = "com/wangzhu/resource/mybatis-config.xml";
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(reader);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return SQL_SESSION_FACTORY;
	}

}
