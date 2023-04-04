package com.java.jsp;
import java.util.Scanner;

public class Diestwo 
{
public static int check(int die1,int die2,boolean nodouble)
{
	
     if(nodouble==true&&die1==6&&die2==6)
	{
		return die1+1;
	}
	else if((nodouble==true&&die1==die2))
	{
		return die1+die2+1;
	}
	else {
	
	return die1+die2;
	}
}
		
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the die1=");
		int die1=sc.nextInt();
		System.out.print("Enter die2=");
		int die2=sc.nextInt();
		System.out.print("Enter boolean=");
		boolean nodoubles=sc.nextBoolean();
        System.out.println(check(die1,die2,nodoubles));
        
	}

}
