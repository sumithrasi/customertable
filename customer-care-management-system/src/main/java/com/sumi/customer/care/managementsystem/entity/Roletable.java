package com.sumi.customer.care.managementsystem.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Roletable {
	@Id
	private int Roleid;
	private String  Rolename;
	private String RoleDescription;
	public Roletable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Roletable(int roleid, String rolename, String roleDescription) {
		super();
		Roleid = roleid;
		Rolename = rolename;
		RoleDescription = roleDescription;
	}
	public int getRoleid() {
		return Roleid;
	}
	public void setRoleid(int roleid) {
		Roleid = roleid;
	}
	public String getRolename() {
		return Rolename;
	}
	public void setRolename(String rolename) {
		Rolename = rolename;
	}
	public String getRoleDescription() {
		return RoleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		RoleDescription = roleDescription;
	}
	@Override
	public String toString() {
		return "Roletable [Roleid=" + Roleid + ", Rolename=" + Rolename + ", RoleDescription=" + RoleDescription + "]";
	}
	
}