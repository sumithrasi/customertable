package com.sumi.customer.care.managementsystem.controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Qualifier;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.servlet.ModelAndView;

	import com.sumi.customer.care.managementsystem.entity.product;
	import com.sumi.customer.care.managementsystem.entity.purchase;
	import com.sumi.customer.care.managementsystem.service.Productservice;
	import com.sumi.customer.care.managementsystem.service.Productservice;
	@Controller
	public class productcontroller {
		@Autowired
		
			private Productservice bservice;
			@RequestMapping("addproduct")
			
			public String addCustomer(product b)
			{
				
				return bservice.addproduct(b);
						}
			
			
			
			
			@RequestMapping("viewproduct")
			@ResponseBody
				public String viewcustomer(int productid)
				{
					return bservice.viewproduct(productid) ;
				}
			
			@RequestMapping("updateproduct")
			@ResponseBody
			public String updatecustomer( product b)
			{	
				return bservice.updateproduct(b);	
			}
			
			@RequestMapping("deleteproduct")
			@ResponseBody
			public String deleteproduct(int customerid)
			{
				return bservice.deleteproduct( customerid) ;
				
			}
			
			
			
			
	}








