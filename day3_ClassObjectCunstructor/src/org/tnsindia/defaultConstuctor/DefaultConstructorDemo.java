package org.tnsindia.defaultConstuctor;

class car
{
	public int speed;
	void display()
	{
		System.out.println("The speed is:" +speed+"km/hr");
	}
	
	car()
	{
		speed = 50;
	}
	
}

public class DefaultConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        car obj = new car();
        obj.display();
	}

}
