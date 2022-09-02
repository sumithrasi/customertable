package com.sumi.customer.care.managementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sumi.customer.care.managementsystem.dao.usertable1;
import com.sumi.customer.care.managementsystem.entity.usertable;

public class usertableservice {
	@Autowired
	private usertable1 bdao;

	
	public String adduser(usertable  b) {
		bdao.save(b);
		return "user Added Successfully";
	}

	
	public String viewuser(int userid) {
		usertable  b1=findById(userid).orElse(null);
				
		if(b1!=null)
		{
			return b1.toString();
		}
		return " some thing wrong";
	}
	
	

	private Optional<usertable > findById(int userid) {
		// TODO Auto-generated method stub
		return null;
	}


	public String updateuser(usertable  b){
		usertable  b1 = bdao.findById(b.getUserid()).orElse(null);
		if(b1 != null)
		{
			bdao.delete(b1);
		}
		bdao.save(b);
		return "user updated successfully..";
	}

	
	public String deleteuser(int userid) {
		usertable  b1 =bdao.findById(userid).orElse(null);
		if(b1 != null)
		{
			bdao.delete(b1);
			return "user deleted Successfully..";
		}
		return "user not found";
	}
	

}
	



