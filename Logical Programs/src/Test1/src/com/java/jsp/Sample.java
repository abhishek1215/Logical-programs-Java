package com.java.jsp;

import java.util.Scanner;

public class Sample 
{
	public static String check2(int day,boolean vac)
	{
		if((vac==true&&day>0&&day<6)||(vac ==false&&(day==0||day==6)))
		{
			return "10:00";
		}
		else if(vac==false&&day>0&&day<6)
		{
			return "7:00";
		}
		return "off";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the day=");
		int day=sc.nextInt();
		System.out.println("enter vaction=");
		boolean vac=sc.nextBoolean();
		System.out.println(check2(day,vac));
		

	}

}
