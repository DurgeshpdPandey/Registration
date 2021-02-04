package com.nacre.demo.bo;

import java.sql.Date;

public class RegistrationBO {
	//Business Object
	
		private String fname=null;
		private String lname=null;
		private String gender=null;
		private Date dob=null;
		private int age=0;
		private double per=0.0;
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
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getPer() {
			return per;
		}
		public void setPer(double per) {
			this.per = per;
		}
		
		
	}

