package org.tnsindia.superkeyword;

class Person
{
	Person()
	{
		System.out.println("Parent class constructor");
	}
}

class Student extends Person
{
	Student()
	{
		super();
		System.out.println("Child class constructor");
	}
}

public class DemoOnSuperClassCunstructor {

	public static void main(String[] args) {
		Student s=new Student();

	}

}