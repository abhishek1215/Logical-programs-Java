package com.java.test;

public class Account 
{
	String accountholdername;
	long aacountnumber;
	double bankbal;
	String branch;
	String ifsc;
	String banknamae;
	public Account(String accountholdername, long aacountnumber, String branch, String ifsc,
			String banknamae)
	{
		super();
		this.accountholdername = accountholdername;
		this.aacountnumber = aacountnumber;
		
		this.branch = branch;
		this.ifsc = ifsc;
		this.banknamae = banknamae;
	}
	public void deposit(double amt)
	{
		bankbal=bankbal+amt;
		System.out.println("amt deposited="+amt);
	}
	public void withdraw(double amt)
	{
		bankbal=bankbal-amt;
		System.out.println("amt withdrawn="+amt);
	}
	public void checkbal()
	{
		
		System.out.println("Current balance="+bankbal);
	}

}
