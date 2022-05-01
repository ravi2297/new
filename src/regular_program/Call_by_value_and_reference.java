package regular_program;

import practice.Car;

public class Call_by_value_and_reference {

int price=300;
	
	public void change_price(Call_by_value_and_reference obj)
	{
		obj.price=obj.price+100;
		System.out.println(price + " in method...");
	}
	
	public static void main(String[] args)
	{
		Call_by_value_and_reference obj=new Call_by_value_and_reference();
		
		System.out.println("before Change :"+obj.price);
		
		obj.change_price(obj);
		
		System.out.println("after change :" + obj.price);
		
	}
}
