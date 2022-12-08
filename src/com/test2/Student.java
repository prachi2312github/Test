package com.test2;



	public class Student
	{
	 int rollNo;
	 String name;
	 String city;
	 Student(int studentRollNo,String studentName,String studentCity)
	 {
		  rollNo=studentRollNo;
		  name=studentName;
		  city=studentCity;
		  System.out.println("Student roll number is::"+rollNo);
		  System.out.println("Student name is::"+name);
		  System.out.println("Student city is::"+city);
	 }
	 public static void main(String[] args)
	 {
		Student student=new Student(1,"Prachi","Pune");
	}
	}

