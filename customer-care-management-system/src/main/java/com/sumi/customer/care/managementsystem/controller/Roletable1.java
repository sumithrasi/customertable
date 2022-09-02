package com.sumi.customer.care.managementsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.sumi.customer.care.managementsystem.entity.Roletable;
import com.sumi.customer.care.managementsystem.entity.product;
import com.sumi.customer.care.managementsystem.entity.purchase;
import com.sumi.customer.care.managementsystem.service.Roletableservice;
import com.sumi.customer.care.managementsystem.service.Productservice;
public class Roletable1 {
	@Autowired
	
	private Roletableservice bservice;
	@RequestMapping("addRole")
	public String addRoll(Roletable b)
	{
		
		return bservice.addRole(b);
	
	}
	@RequestMapping("viewRole")
	
		public String viewcustomer(int Roleid)
		{
			return bservice.viewRole( Roleid) ;
		}
	
	@RequestMapping("updateRole")
	@ResponseBody
	public String updateRoletable( Roletable b)
	{	
		return bservice.updateRole( b);	
	}
	
	@RequestMapping("deleteRole")
	@ResponseBody
	public String deleteRoletable(int  Roleid)
	{
		return bservice.deleteRole( Roleid)  ;
		
	}
	
	
	


}







