package com.sumi.customer.care.managementsystem.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class product {
@Id
private int productid;
private String productname;
private double sellingprice;
private double costprice;
private int stockunit;
public product() {
	super();
	// TODO Auto-generated constructor stub
}
public product(int productid, String productname, double sellingprice, double costprice, int stockunit) {
	super();
	this.productid = productid;
	this.productname = productname;
	this.sellingprice = sellingprice;
	this.costprice = costprice;
	this.stockunit = stockunit;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public double getSellingprice() {
	return sellingprice;
}
public void setSellingprice(double sellingprice) {
	this.sellingprice = sellingprice;
}
public double getCostprice() {
	return costprice;
}
public void setCostprice(double costprice) {
	this.costprice = costprice;
}
public int getStockunit() {
	return stockunit;
}
public void setStockunit(int stockunit) {
	this.stockunit = stockunit;
}
@Override
public String toString() {
	return "product [productid=" + productid + ", productname=" + productname + ", sellingprice=" + sellingprice
			+ ", costprice=" + costprice + ", stockunit=" + stockunit + "]";
}


}

