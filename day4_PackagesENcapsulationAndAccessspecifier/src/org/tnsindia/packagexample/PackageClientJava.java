package org.tnsindia.packagexample;

import java.util.Scanner;

import org.tnsindia.packagedemo.PackageDemo;

public class PackageClientJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1 =s.nextLine();
		
		PackageDemo d=new PackageDemo();
		d.str=str1;
		d.display();
		s.close();

	}

}
