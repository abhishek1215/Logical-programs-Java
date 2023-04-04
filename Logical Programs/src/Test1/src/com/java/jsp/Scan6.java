package com.java.jsp;

import java.util.Arrays;
class One extends Exception
{
	public One(String msg)
	{
		super(msg);
	}
}

public class Scan6 
{
	public static void check()throws One
	{
		throw new One("Welcome to Abhishek's Exception");
	}
    public static void main(String[]args) 
    {
    	try {
			check();
		} catch (One e) 
    	{
			e.printStackTrace();
		}
    	
    }
}
