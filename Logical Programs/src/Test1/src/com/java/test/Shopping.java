package com.java.test;

public class Shopping extends Debitcard
{
  String productname;
  double productprice;
  String shippingaddress;
  Account a1;
  
  public void Selectproduct(String productname,double productprice,String shippingaddress,Account a1)
  {
	  this.productname=productname;
	  this.productprice=productprice;
	  this.shippingaddress=shippingaddress;
	  this.a1=a1;
	  
	  System.out.println("product is selected and make online payment to buy now");
	  onlinepayment(productprice,a1);
	  
  }
  
  
	
	
}
