package com.evaluate.eos.impl.pojo;

import java.util.List;

/**
 * 分页参数
 * @author LangWu
 *
 */
public class BaseVO <T>{
	
	// 页码
	private Integer pageIndex;
	
	// 条数
	private Integer pageSize;
	
	// 主键类型，方便做批量删除
	private List<T> ids;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getIds() {
		return ids;
	}

	public void setIds(List<T> ids) {
		this.ids = ids;
	}

}
