package com.phoenix.demos;

class Reactangle
{
	private float length;
	private float width;
	
	public Reactangle()
	{
		
	}
	public Reactangle(float length, float width)
	{
		this.length = length;
		this.width = width;
	}
	 public void setLenght(float length)
	 {
		 this.length = length;
	 }
	 
	 public float getLength()
	 {
		 return length;
	 }
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Reactangle [length=" + length + ", width=" + width + "]";
	}
	 
	 public double reactArea()
	 {
		 return this.length * this.width;
	 }
	 
	 public double reactPerimeter()
	 {
		 return 2*(this.length + this.width);
	 }
}

public class ReactangleArea {

	public static void main(String[] args) {
	
		Reactangle react = new Reactangle(4.5f, 5.5f);
		System.out.println("Area of Reactangle = "+ react.reactArea());
		System.out.println("Area of Reactangle = "+ react.reactPerimeter());
		System.out.println(react);
		
		

	}

}
