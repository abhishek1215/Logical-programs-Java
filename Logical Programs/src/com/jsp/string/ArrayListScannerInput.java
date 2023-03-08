package com.jsp.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScannerInput
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer>l1=new ArrayList<Integer>(n);
		while(sc.hasNextInt())
		{
			l1.add(sc.nextInt());
		}
		System.out.println(l1);

	}

}
