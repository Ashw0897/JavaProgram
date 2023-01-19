package com.phoenix.demos;

 final class Person // not inherited
{
	final int a= 100;// constatnt can not assign again
	
	Person()
	{
		//a = 200; constatnt can not assign again
		
	}
	
	final public void test()
	{
		System.out.println("Can not overide final method");
	}
}

class Employee extends Person
{
	public void test()
	{
		// Can not override
	}
}

public class FinalKeywordexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
