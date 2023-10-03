package com.jpa;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student1 {
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String stdname;
	private String course;
	private double fee;
	public Student1() {
		super();
	}
	public Student1(int sid, String stdname, String course, double fee) {
		super();
		this.sid = sid;
		this.stdname = stdname;
		this.course = course;
		this.fee = fee;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", stdname=" + stdname + ", course=" + course + ", fee=" + fee + "]";
	}
	

}

