package com.wtu.vo;

//老师类
public class Teacher {

	private int tid;//
	private String tname;// 姓名
	private String tjob;// 职称
	private String tdate;//
	private String tprief;
	private String temail;
	private int tmajor;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTjob() {
		return tjob;
	}
	public void setTjob(String tjob) {
		this.tjob = tjob;
	}
	public String getTdate() {
		return tdate;
	}
	public void setTdate(String tdate) {
		this.tdate = tdate;
	}
	public String getTprief() {
		return tprief;
	}
	public void setTprief(String tprief) {
		this.tprief = tprief;
	}
	public String getTemail() {
		return temail;
	}
	public void setTemail(String temail) {
		this.temail = temail;
	}
	public int getTmajor() {
		return tmajor;
	}
	public void setTmajor(int tmajor) {
		this.tmajor = tmajor;
	}
}
