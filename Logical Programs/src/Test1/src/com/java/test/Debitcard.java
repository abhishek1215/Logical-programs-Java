package com.java.test;

public class Debitcard 
{
   long pinnum;
   int cvv;
   String expdate;
   Account a1;

public void updatepin(long pinnum)
{
	this.pinnum=pinnum;
	System.out.println("New pin number="+pinnum);
	
}
public void updatecvvexp(int cvv,String expdate)
{
	this.cvv=cvv;
	this.expdate=expdate;
	System.out.println("New cvv="+cvv+" "+"New expdate="+expdate);
}
public void onlinepayment(double productprice,Account a1)
{
	this.a1=a1;
	if(a1.bankbal>productprice)
	{
		a1.withdraw(productprice);
		System.out.println("Payment successful and ordered is placed");
	}
	else
	{
		System.out.println("Insuffient balance");
	}
	
}

   
   




}
