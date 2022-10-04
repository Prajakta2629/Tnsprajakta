package org.tnsindia.Abstract;

abstract class C
{
	void print()
	{
		System.out.println("Non-abstract Method");
	}
}
class D extends C
{
	
}

public class DemoOnAbstractClass {

	public static void main(String[] args) {
		C c=new D();
		c.print();

	}

}