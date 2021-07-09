package com.hsx.easyui.domain.vo;

/**
 * @author HEXIONLY
 * @Date 2021年7月9日下午2:13:07
 */
public class PersonQueryVo {

	private Integer page;
	private Integer rows;
	private String keyword;

	private String sort;
	private String order;

	public PersonQueryVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonQueryVo(Integer page, Integer rows, String keyword, String sort, String order) {
		super();
		this.page = page;
		this.rows = rows;
		this.keyword = keyword;
		this.sort = sort;
		this.order = order;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "PersonQueryVo [page=" + page + ", rows=" + rows + ", keyword=" + keyword + ", sort=" + sort + ", order="
				+ order + "]";
	}

}
