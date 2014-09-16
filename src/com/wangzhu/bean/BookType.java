package com.wangzhu.bean;

public class BookType {

	private Integer id;
	private String title;
	private String detail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "{id=" + id + ", title=" + title + ", detail=" + detail + "}";
	}

}
