package org.tnsindia.overloading;

class shape
{
	public void area()
	{
		System.out.println("find area:");
	}
	public void area(int r)
	{
		System.out.println("Area of circle:"+(3.13*r*r));
	}
	public void area(int l,int b)
	{
		System.out.println("Area of rectangle:"+(l*b));
	}
}



public class ExampleOnMethodOverloading {

	public static void main(String[] args) {
	shape s=new shape();
	s.area();
	s.area(2);
	s.area(10,15);
	
	}

}
