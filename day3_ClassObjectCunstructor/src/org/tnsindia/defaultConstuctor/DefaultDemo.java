package org.tnsindia.defaultConstuctor;

import java.util.Scanner;

class Bus
{
	public int speed;
	
	public Bus()
	{
		 System.out.println("default Constructor");
	}
}

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Value of speed:");
        int speed=s.nextInt();
        Bus b = new Bus();
	}

}
