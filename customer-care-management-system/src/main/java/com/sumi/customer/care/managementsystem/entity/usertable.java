package com.sumi.customer.care.managementsystem.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class usertable {
	@Id
	private int userid;
	private String Firstname;
	private String lastname;
	private String Emailid;
	private String mobileno;
	private String balance;
	private String Address;
	public usertable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public usertable(int userid, String firstname, String lastname, String emailid, String mobileno, String balance,
			String address) {
		super();
		this.userid = userid;
		Firstname = firstname;
		this.lastname = lastname;
		Emailid = emailid;
		this.mobileno = mobileno;
		this.balance = balance;
		Address = address;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "usertable [userid=" + userid + ", Firstname=" + Firstname + ", lastname=" + lastname + ", Emailid="
				+ Emailid + ", mobileno=" + mobileno + ", balance=" + balance + ", Address=" + Address + "]";
	}
	
}
