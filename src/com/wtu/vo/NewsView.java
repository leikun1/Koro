package com.wtu.vo;

public class NewsView {

	private int nid;// 编号
	private String ntitle;// 标题
	private String ncontent;// 内容
	private String ntime;// 时间
	private String nsource;// 内容来源
	private int ncount;// 点击率
	private int ncid;//
	private String nuploadUrl;// 上传文件url
	private String npicUrl;// 轮播新闻图片url
	private int nstate;// 新闻状态
	private String ncname;// 新闻类别

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getNtitle() {
		return ntitle;
	}

	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}

	public String getNcontent() {
		return ncontent;
	}

	public void setNcontent(String ncontent) {
		this.ncontent = ncontent;
	}

	public String getNtime() {
		return ntime;
	}

	public void setNtime(String ntime) {
		this.ntime = ntime;
	}

	public String getNsource() {
		return nsource;
	}

	public void setNsource(String nsource) {
		this.nsource = nsource;
	}

	public int getNcount() {
		return ncount;
	}

	public void setNcount(int ncount) {
		this.ncount = ncount;
	}

	public int getNcid() {
		return ncid;
	}

	public void setNcid(int ncid) {
		this.ncid = ncid;
	}

	public String getNuploadUrl() {
		return nuploadUrl;
	}

	public void setNuploadUrl(String nuploadUrl) {
		this.nuploadUrl = nuploadUrl;
	}

	public String getNpicUrl() {
		return npicUrl;
	}

	public void setNpicUrl(String npicUrl) {
		this.npicUrl = npicUrl;
	}

	public int getNstate() {
		return nstate;
	}

	public void setNstate(int nstate) {
		this.nstate = nstate;
	}

	public String getNcname() {
		return ncname;
	}

	public void setNcname(String ncname) {
		this.ncname = ncname;
	}

}
