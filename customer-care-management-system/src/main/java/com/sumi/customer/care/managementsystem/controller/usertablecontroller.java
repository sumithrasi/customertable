package com.sumi.customer.care.managementsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sumi.customer.care.managementsystem.entity.product;
import com.sumi.customer.care.managementsystem.entity.usertable;
import com.sumi.customer.care.managementsystem.service.usertableservice;
import com.sumi.customer.care.managementsystem.service.Productservice;
public class usertablecontroller {
	@Autowired
	
	private usertableservice bservice;
	@RequestMapping("adduser")
	public String adduser(usertable b)
	{
		
		return bservice.adduser(b);
				}
	
	@RequestMapping("viewuser")
	
		public String viewcustomer(int userid)
		{
			return bservice.viewuser( userid) ;
		}
	
	@RequestMapping("updateuser")
	@ResponseBody
	public String updatecustomer( usertable b)
	{	
		return bservice.updateuser(b);	
	}
	
	@RequestMapping("deleteuser")
	@ResponseBody
	public String deletecustomer(int userid)
	{
		return bservice.deleteuser( userid) ;
		
	}
	
	

}







