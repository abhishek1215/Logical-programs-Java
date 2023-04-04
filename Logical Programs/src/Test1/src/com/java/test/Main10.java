package com.java.test;

public class Main10 
{
    public static void main(String[] args)
    {
		Account a1=new Account("abhi",12344555l,"basavangudi","icici003","icici");
		a1.deposit(10000.0);
		Debitcard d1=new Debitcard();
		d1.updatepin(123214551l);
		d1.updatecvvexp(567, "12/24");
		Shopping s1=new Shopping();
		s1.Selectproduct("T-shirt", 6000.0, "Bangalore", a1);
		
		a1.checkbal();
	}
}
