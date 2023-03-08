package com.jsp.string;

class Whatsapp1
{
	public void send()
	{
		System.out.println("send msg of whatsapp version-1");
	}
}
class Whatsapp2 extends Whatsapp1
{
	
	public void send()
	{
		super.send();
		System.out.println("send video of whatsapp version-2");
	}
}



public class SuperKeywordExample
{

	public static void main(String[] args) 
	{
		Whatsapp2 w1=new Whatsapp2();
		w1.send();

	}

}
