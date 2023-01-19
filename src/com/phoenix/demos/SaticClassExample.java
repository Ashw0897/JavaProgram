package com.phoenix.demos;

class Outer
{
	static String msg = "Hello World";
	String msg1 = "Hello Java";
	
	static class StaicNeasted //static nested class
	{
		public void test()
		{
			System.out.println(msg);
		}
	}
	
	class Inner
	{
		public void demo()
		{
			System.out.println(msg);
			System.out.println(msg1);
		}
	}
}

public class SaticClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Outer.StaicNeasted obj = new Outer.StaicNeasted();
	    obj.test();
	    
	    Outer.Inner innerobj = new Outer().new Inner();
	    innerobj.demo();
	}

}
