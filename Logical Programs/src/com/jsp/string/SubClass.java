package com.jsp.string;

class SuperClass
{
	public SuperClass(int n)
	{
		System.out.println("Superclass constructor");
	}
}
public class SubClass extends SuperClass
{
	public SubClass()
	{
		super(5);
		System.out.println("subclass constructor");
	}

	public static void main(String[] args) 
	{
		SubClass c1=new SubClass();

	}

}
