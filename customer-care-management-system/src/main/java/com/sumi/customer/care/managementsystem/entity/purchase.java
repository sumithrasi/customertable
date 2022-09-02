package com.sumi.customer.care.managementsystem.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class purchase {
	@Id
	private int purchaseid;
	private Date  purchasedate;
	private int productid;
	private int totalunit;
	public purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public purchase(int purchaseid, Date purchasedate, int productid, int totalunit) {
		super();
		this.purchaseid = purchaseid;
		this.purchasedate = purchasedate;
		this.productid = productid;
		this.totalunit = totalunit;
	}
	public int getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(int purchaseid) {
		this.purchaseid = purchaseid;
	}
	public Date getPurchasedate() {
		return purchasedate;
	}
	public void setPurchasedate(Date purchasedate) {
		this.purchasedate = purchasedate;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getTotalunit() {
		return totalunit;
	}
	public void setTotalunit(int totalunit) {
		this.totalunit = totalunit;
	}
	@Override
	public String toString() {
		return "purchase [purchaseid=" + purchaseid + ", purchasedate=" + purchasedate + ", productid=" + productid
				+ ", totalunit=" + totalunit + "]";
	}
	
	
	
}
