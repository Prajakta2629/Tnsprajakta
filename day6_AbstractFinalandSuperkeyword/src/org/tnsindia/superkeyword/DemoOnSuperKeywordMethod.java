package org.tnsindia.superkeyword;

class Parent
{
	public void print()
	{
		System.out.println("Welcome to M25 Batch");
	}
}
class Child extends Parent
{
	public void print()
	{
		System.out.println("Congratulations for your Selection in screening");
	}
	public void display()
	{
		print();
		super.print();
	}
}


public class DemoOnSuperKeywordMethod {

	public static void main(String[] args) {
		Child c=new Child();
        c.display();
	}

}