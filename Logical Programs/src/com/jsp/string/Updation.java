package com.jsp.string;

public class Updation 
{
	Student s1;
	public Updation(Student s1)
	{
		this.s1=s1;
	}
   public void Studentdetails()
   {
	  
	   System.out.println(s1.getName());
	   System.out.println(s1.getRollno());
   }
   public void updatename(String s)
   {
	   s1.setName(s);
   }
   public void updaterollno(int n)
   {
	   s1.setRollno(n);
   }
}
