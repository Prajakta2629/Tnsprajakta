package org.tnsindia.enumdemo;

public class EnumMEalDemo {

	public static void main(String[] args) {
		for(Meal m:Meal.values())
		{
			System.out.println(m+" "+m.getValue());
		}

	}

}
