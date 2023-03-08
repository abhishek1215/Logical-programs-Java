package com.jsp.string;

public class MainEncapsulation
{

	public static void main(String[] args) 
	{
		Student s1=new Student("Abhi",126);
		Updation u1=new Updation(s1);
		u1.Studentdetails();
		u1.updaterollno(189);;
		u1.Studentdetails();

	}

}
