package org.tnsindia.superkeyword;

class Animal
{
	protected String name="Animal";
	public void display(String name)
	{
		System.out.println("The name of the Animal is:"+name);
	}
}

class Dog extends Animal
{
	public String name="Dog";
	public void display()
	{
		System.out.println("The name of the Animal is:"+name);
		System.out.println(super.name);
	}
}

public class DemoOnSuperKeywordVariable {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.display();
        
	}

}