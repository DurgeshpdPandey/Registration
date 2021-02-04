package com.vo;

public class RegistrationVO {
//variable definition	
	private String fname=null;
	private String lname=null;
	private String gender=null;
	private String dob=null;
	private String age=null;
	private String per=null;
//their getter and setter	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPer() {
		return per;
	}
	public void setPer(String per) {
		this.per = per;
	}	
}
