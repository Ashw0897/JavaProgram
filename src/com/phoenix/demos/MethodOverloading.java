package com.phoenix.demos;

class MaxNumberChecking
{
	public void MaxCheacking(int a, int b)
	{
		if(a>b)
		{
			System.out.println("a is Max "+ a);
		}
		else
		{
			System.out.println("b is Max "+ b);
		}
	}
	
	public void MaxCheacking(float a, float b)
	{
		if(a>b)
		{
			System.out.println("a is Max "+ a);
		}
		else
		{
			System.out.println("b is Max "+ b);
		}
	}
	
	public void MaxCheacking(int a, int b, int c)
	{
		if((a>b)&&(a>c))
		{
			System.out.println("a is Max "+ a);
		}
		else if(b>c)
		{
			System.out.println("b is Max "+ b);
		}
		else 
		{
			System.out.println("c is Max "+ c);
		}
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxNumberChecking max = new MaxNumberChecking();
		max.MaxCheacking(7, 8);
		max.MaxCheacking(4.5f, 4.3f);
		max.MaxCheacking(6, 3, 7);

	}

}
