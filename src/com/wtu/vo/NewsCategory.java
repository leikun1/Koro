package com.wtu.vo;

//新闻类别
public class NewsCategory {

	private int ncid;//
	private String ncname;// 新闻类别
	private String nremark;// 备注

	public int getNcid() {
		return ncid;
	}

	public void setNcid(int ncid) {
		this.ncid = ncid;
	}

	public String getNcname() {
		return ncname;
	}

	public void setNcname(String ncname) {
		this.ncname = ncname;
	}

	public String getNremark() {
		return nremark;
	}

	public void setNremark(String nremark) {
		this.nremark = nremark;
	}

}
