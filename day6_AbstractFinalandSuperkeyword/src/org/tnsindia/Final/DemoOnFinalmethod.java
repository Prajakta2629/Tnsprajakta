package org.tnsindia.Final;

class FinalMethod
{
    void accept()
	{
	System.out.println("Final method cannot be override");

	}
}

class Child extends FinalMethod
{
	void accept()
	{
		System.out.println("Child class");
	}
}


public class DemoOnFinalmethod {

	public static void main(String[] args) {
		Child c=new Child();
		c.accept();

	}

}