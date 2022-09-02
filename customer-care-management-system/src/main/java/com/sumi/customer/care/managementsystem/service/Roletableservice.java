
package com.sumi.customer.care.managementsystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.sumi.customer.care.managementsystem.dao.Roletable2;
import com.sumi.customer.care.managementsystem.entity.Roletable;

public class Roletableservice {
	@Autowired
	private Roletable2 bdao;

	
	public String addRole(Roletable  b) {
		bdao.save(b);
		return "Role Added Successfully";
	}

	
	public String viewRole(int Roleid) {
		Roletable  b1=findById(Roleid).orElse(null);
				
		if(b1!=null)
		{
			return b1.toString();
		}
		return " some thing wrong";
	}
	
	

	private Optional<Roletable > findById(int Roleid) {
		// TODO Auto-generated method stub
		return null;
	}


	public String updateRole(Roletable  b){
		Roletable  b1 = bdao.findById(b.getRoleid()).orElse(null);
		if(b1 != null)
		{
			bdao.delete(b1);
		}
		bdao.save(b);
		return "Role updated successfully..";
	}

	
	public String deleteRole(int Roleid) {
		Roletable  b1 =bdao.findById(Roleid).orElse(null);
		if(b1 != null)
		{
			bdao.delete(b1);
			return "Role deleted Successfully..";
		}
		return "ROLE not found";
	}
	

}
	
	











