package com.sumi.customer.care.managementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sumi.customer.care.managementsystem.dao.purchaseRepo1;
import com.sumi.customer.care.managementsystem.entity.purchase;

public class purchaseservice {
	@Autowired
	private purchaseRepo1 bdao;

	
	public String addpurchase(purchase  b) {
		bdao.save(b);
		return "purchase Added Successfully";
	}

	
	public String viewpurchase(int purchaseid) {
		purchase  b1=findById(purchaseid).orElse(null);
				
		if(b1!=null)
		{
			return b1.toString();
		}
		return " some thing wrong";
	}
	
	

	private Optional<purchase > findById(int purchaseid) {
		// TODO Auto-generated method stub
		return null;
	}


	public String updatepurchase(purchase  b){
		purchase b1 = bdao.findById(b. getPurchaseid()).orElse(null);
		if(b1 != null)
		{
			bdao.delete(b1);
		}
		bdao.save(b);
		return "purchase updated successfully..";
	}

	
	public String deletepurchase(int purchaseid) {
		purchase  b1 =bdao.findById(purchaseid).orElse(null);
		if(b1 != null)
		{
			bdao.delete(b1);
			return "purchase deleted Successfully..";
		}
		return "purchase not found";
	}
	

}
	
	







