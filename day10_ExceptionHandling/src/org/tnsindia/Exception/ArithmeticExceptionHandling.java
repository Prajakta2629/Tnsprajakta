package org.tnsindia.Exception;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		try {
        int result=a/b;
        System.out.println("THe Result is: "+result);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Arithmetic Exception Handling USing Catch Block");
	    }
		finally
		{
			System.out.println("Finally block is always executed");
	    }
		System.out.println(" Exception Handling");
    
        s.close();
}
}
