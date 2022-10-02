package org.tnsindia.abstraction;

class B
{
	public String dob="2000-12-29";
	void display()
	{
		System.out.println("The DOB is:"+dob);
	}
			
}

public class DemoOnPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();

	}

}
