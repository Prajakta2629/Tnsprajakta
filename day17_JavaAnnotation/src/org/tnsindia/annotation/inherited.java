package org.tnsindia.annotation;



@inherited
public @interface inherited {
	class Parent
	{
		public void print()
		{
			System.out.println("Parent class method");
		}
	}

	class Child extends Parent
	{

	    @Override
	    public void print()
	    {
		    System.out.println("Child class method");
	    }
	}
	


public class OverrideAnnotationDemo {

		public static void main(String[] args) {
			
			Child p=new Child();
			p.print();
		}

	}
}
