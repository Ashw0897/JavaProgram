package com.phoenix.demos;

class CircleArea
{
	private double redius = 1.0;
	
	public CircleArea()
	{
		
	}
	
	public CircleArea(double redius)
	{
		this.redius = redius;
	}

	public double getRedius() {
		return redius;
	}

	public void setRedius(double redius) {
		this.redius = redius;
	}
	public double getcircleArea()
	{
		
		return Math.PI*this.redius*this.redius;
		
     }
	
	public double getcircleCircum()
	{
		return 2*Math.PI*this.redius;
		
	}

	@Override
	public String toString() {
		return "CircleArea [redius=" + redius + "]";
	}
}



public class Circle {

	public static void main(String[] args) {

       CircleArea ca = new CircleArea(12.67);
      System.out.println("Area of Circle = "+ca.getcircleArea());
      System.out.println("Area of Circumferance = "+ca.getcircleCircum());
      System.out.println(ca);
       
       
	}

}
