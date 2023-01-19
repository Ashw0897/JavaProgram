package com.phoenix.demos;

class Animal
{
	int a = 200;
	public Animal()
	{
		System.out.println("This is animal class");
	}
	
	public void animalTest()
	{
		System.out.println("This is animal class");
	}
}
	
	class Dog extends Animal
	{
		int d = 300;
		public Dog()
		{
			super();
			System.out.println("This is Dog class constructor");
		}
		public void dogTest()
	    {
	        
	        super.animalTest();
	        System.out.println("This is Dog test method..");
	        System.out.println(super.a);
	    }
	}


public class SuperKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		Dog d = new Dog();
		d.dogTest();

	}

}
