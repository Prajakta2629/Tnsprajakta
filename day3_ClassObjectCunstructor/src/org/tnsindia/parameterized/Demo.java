package org.tnsindia.parameterized;

import java.util.Scanner;


class Bus
{
	public int speed;
	
	Bus(int s)
	{
		speed = s;
		System.out.println("The speed is:" +speed+"km/hr");
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        System.out.println("Enter The Value of speed:");
	        int speed=s.nextInt();
	        Bus b = new Bus(speed);
	}

}
