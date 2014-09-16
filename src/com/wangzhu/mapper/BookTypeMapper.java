package com.wangzhu.mapper;

import java.util.List;

import com.wangzhu.bean.BookType;

public interface BookTypeMapper {

	public int insert(BookType diqu);

	public int update(BookType diqu);

	public int delete(Integer id);

	public List<BookType> selectAll();

	public int countAll();

	public BookType findById(Integer id);

}
