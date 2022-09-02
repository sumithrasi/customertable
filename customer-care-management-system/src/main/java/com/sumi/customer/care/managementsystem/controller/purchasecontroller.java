package com.sumi.customer.care.managementsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sumi.customer.care.managementsystem.entity.product;
import com.sumi.customer.care.managementsystem.entity.purchase;
import com.sumi.customer.care.managementsystem.service.purchaseservice;
import com.sumi.customer.care.managementsystem.service.Productservice;
public class purchasecontroller {
	@Autowired
	
	private purchaseservice bservice;
	@RequestMapping("addpurchase")
	public String addpurchase( purchase b)
	{
		
		return bservice.addpurchase(b);
				}
	
	
	
	@RequestMapping("viewpurchase")
	
		public String viewpurchase(int customerid)
		{
			return bservice.viewpurchase(customerid) ;
		}
	
	@RequestMapping("updatepurchase")
	@ResponseBody
	public String updatepurchase(  purchase b)
	{	
		return bservice.updatepurchase(b);	
	}
	
	@RequestMapping("deletepurchase")
	@ResponseBody
	public String deletepurchase(int customerid)
	{
		return bservice.deletepurchase( customerid) ;
		
	}
	
	
	
	

}







