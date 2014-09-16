package com.wangzhu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.wangzhu.bean.BookType;
import com.wangzhu.mapper.BookTypeMapper;
import com.wangzhu.util.MyBatisUtil;

public class DiquTest {
	static SqlSessionFactory sqlSessionFactory = null;
	static {
		sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
	}

	public void testAdd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			BookTypeMapper dao = sqlSession.getMapper(BookTypeMapper.class);
			BookType bookType = new BookType();
			bookType.setTitle("mybatis title");
			bookType.setDetail("mybatis detail");
			dao.insert(bookType);
			// 这里一定要提交，否则数据写不进数据库中
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public void testUpdate() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			BookTypeMapper dao = sqlSession.getMapper(BookTypeMapper.class);
			BookType bookType = new BookType();
			bookType.setId(47);
			bookType.setTitle("mybatis new title");
			bookType.setDetail("mybatis new detail");
			dao.update(bookType);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public void testDelete() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			BookTypeMapper dao = sqlSession.getMapper(BookTypeMapper.class);
			dao.delete(47);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public void testSelectAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			BookTypeMapper dao = sqlSession.getMapper(BookTypeMapper.class);
			List<BookType> bookTypeList = dao.selectAll();
			for (BookType bookType : bookTypeList) {
				System.out.println("testSelectAll: " + bookType);
			}
		} finally {
			sqlSession.close();
		}
	}

	public void testCountAll() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			BookTypeMapper dao = sqlSession.getMapper(BookTypeMapper.class);
			int count = dao.countAll();
			System.out.println("testCountAll: " + count);
		} finally {
			sqlSession.close();
		}
	}

	public static void main(String[] args) {
		DiquTest test = new DiquTest();

		test.testSelectAll();
		test.testCountAll();
		// test.testAdd();
		// test.testUpdate();
		test.testDelete();
	}
}
