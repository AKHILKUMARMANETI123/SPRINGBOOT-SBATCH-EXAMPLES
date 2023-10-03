package com.mvc;

import java.util.List;

public class User {
	private int sid;
	private String fname;
	private String lname;
	private List<String> courses;
	private List<String> gender;
	private long mnum;
	private int jmarks;
	private int smarks;
	private int hmarks;
	public User() {
		super();
	}
	public User(int sid, String fname, String lname, List<String> courses, List<String> gender, long mnum, int jmarks,
			int smarks, int hmarks) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
		this.courses = courses;
		this.gender = gender;
		this.mnum = mnum;
		this.jmarks = jmarks;
		this.smarks = smarks;
		this.hmarks = hmarks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public List<String> getGender() {
		return gender;
	}
	public void setGender(List<String> gender) {
		this.gender = gender;
	}
	public long getMnum() {
		return mnum;
	}
	public void setMnum(long mnum) {
		this.mnum = mnum;
	}
	public int getJmarks() {
		return jmarks;
	}
	public void setJmarks(int jmarks) {
		this.jmarks = jmarks;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public int getHmarks() {
		return hmarks;
	}
	public void setHmarks(int hmarks) {
		this.hmarks = hmarks;
	}
	@Override
	public String toString() {
		return "User [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", courses=" + courses + ", gender="
				+ gender + ", mnum=" + mnum + ", jmarks=" + jmarks + ", smarks=" + smarks + ", hmarks=" + hmarks + "]";
	}
	
}
