package com.phoenix.demos;

class Parent
{
	void display()
	{
		System.out.println("This is Parent display method..");
	}
}

class Child extends Parent
{
	void display()
	{
		System.out.println("This is Child display method..");
	} 
}

public class MethodOverrriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.display();
		
		Parent obj = new Child();
	    obj.display();

	}

}
