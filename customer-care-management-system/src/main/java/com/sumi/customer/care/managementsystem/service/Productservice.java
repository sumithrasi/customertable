package com.sumi.customer.care.managementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumi.customer.care.managementsystem.dao.product1;
import com.sumi.customer.care.managementsystem.entity.product;

@Service
public class Productservice {
	@Autowired
	private product1 bdao;

	
	public String addproduct( product  b) {
		bdao.save(b);
		return "product Added Successfully";
	}

	
	public String viewproduct(int productid) {
		product  b1=findById(productid).orElse(null);
				
		if(b1!=null)
		{
			return b1.toString();
		}
		return " some thing wrong";
	}
	
	

	private Optional< product > findById(int purchaseid) {
		// TODO Auto-generated method stub
		return null;
	}


	public String updateproduct(product  b){
		 product b1 = bdao.findById(b. getProductid()).orElse(null);
		if(b1 != null)
		{
			bdao.delete(b1);
		}
		bdao.save(b);
		return "product deleted successfully..";
	}

	
	public String deleteproduct(int productid) {
		 product  b1 =bdao.findById(productid).orElse(null);
		if(b1 != null)
		{
			bdao.delete(b1);
			return "product deleted Successfully..";
		}
		return "product not found";
	}
	

}
	
	











		
		
	

	
	
	
	


