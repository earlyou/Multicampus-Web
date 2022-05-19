package com.multi.controller;

import java.sql.Date;

public class mem {
	// Fields
	public String id;
	public String pwd;
	public String name;
	public Date date;
	public String gender;
	
	// Constructor
	public mem() {
	}
	public mem(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	public mem(String id, String pwd, String name, Date date, String gender) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.date = date;
		this.gender = gender;
	}
	
	// Getter & Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// toString
	@Override
	public String toString() {
		return "회원정보 [id=" + id + ", pwd=" + pwd + ", name=" + name + ", date=" + date + ", gender=" + gender + "]";
	}
	
}
