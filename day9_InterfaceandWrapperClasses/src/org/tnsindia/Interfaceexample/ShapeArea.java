package org.tnsindia.Interfaceexample;
import java.util.Scanner;
public class ShapeArea implements Area{

	public void circle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
        double r=s.nextDouble();
        System.out.println(" The area of circle:"+3.142*r*r);
        
	}
	public void square() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the side of Square:");
        double side=s.nextDouble();
        System.out.println(" The area of Square:"+side*side);
        
	}

}
