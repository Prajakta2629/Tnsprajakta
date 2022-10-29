package org.tnsindia.annotation;

class Parent
{
	public void print()
	{
		System.out.println("Parent Class method");
	}
}
class Child extends Parent
{
	@Override
	public void print()
	{
		System.out.println("Child Class method");
	}
}


public class OverrideAnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Child p=new Child();
        p.print();
	}

}
