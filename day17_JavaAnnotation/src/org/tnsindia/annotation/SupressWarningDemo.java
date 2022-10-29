package org.tnsindia.annotation;

import java.util.Scanner;

public class SupressWarningDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         @SuppressWarnings("resource")
	   	Scanner s=new Scanner(System.in);
         int x=s.nextInt();
         System.out.println(x);
	}

}
