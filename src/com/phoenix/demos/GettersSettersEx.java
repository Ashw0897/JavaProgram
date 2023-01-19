package com.phoenix.demos;

class Student

{
	private long studId;
	private String studName;
	public Student() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Student(long studId, String studName) {
		this.studId = studId;
		this.studName = studName;
	}

	public long getStudId() {
		return studId;
	}

	public void setStudId(long studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	private void test()
	{
		System.out.println("Private Metod....");;
	}
	
	public void accesstest()
	{
		this.test();
	}
	
}
	
	public class GettersSettersEx {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud = new Student();
		stud.setStudId(102);
		stud.setStudName("Anandi");
		stud.accesstest();
		
		System.out.println("ID is"+ stud.getStudId());
		System.out.println("Name ="+stud.getStudName());

	}

}
