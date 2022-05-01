package practice;

import java.util.Scanner;

public class Bmw 
{
	String color;
	int price;
	
	Bmw(String color1,int price1)
	{
		color=color1;
		price=price1;
		System.out.println("get called first constructor");
	}
	
	Bmw(Bmw c)
	{
		color=c.color;
		price=c.price;
	}
	
	public void display()
	{
		System.out.println(color + " " + price);
	}
	
	public static void main(String[] args)
	{
		Bmw cd=new Bmw("blue",30000);
		Bmw dc=new Bmw(cd);
		
		cd.display();
		dc.display();
		
		
	}
}