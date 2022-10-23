package org.tnsindia.enumdemo;

public class EnumCarDemo {

	public static void main(String[] args) {
		/*Car r1=Car.TESLA;
		System.out.println(r1);*/
		for(Car c:Car.values())
		{
			System.out.println(c);
		//	System.out.println(c.MARUTI);
		}

	}

}
