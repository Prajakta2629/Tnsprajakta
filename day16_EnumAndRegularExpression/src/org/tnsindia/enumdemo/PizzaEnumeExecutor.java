package org.tnsindia.enumdemo;

import java.util.Scanner;

import org.tnsindia.enumdemo.PizzaEnumDemo.Size;


public class PizzaEnumeExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of pizza:");
		String size=s.nextLine();
		Size s1= Size.valueOf(size.toUpperCase());
	switch(s1)
	{
		case SMALL:
		  System.out.println("preparing Small Pizza For Customer");
		  break;
		case MEDIUM:
		  System.out.println("preparing MEDIUM Pizza For Customer");
		  break;
		case LARGE:
		  System.out.println("preparing LARGE Pizza For Customer");
		  break;
		case EXTRALARGE:
		  System.out.println("preparing EXTRALARGE Pizza For Customer");
		  break;
	}

	}

}
