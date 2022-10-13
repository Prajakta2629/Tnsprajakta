package org.tnsindia.Exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
	try {
		int a=args.length;
		System.out.println("The length of a is: "+a);
		int b=12/a;
		
		System.out.println(b);
		int arr[]= {11};
		arr[4]=55;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception Occured"+e);
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException Occured"+e);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
	   System.out.println("Finally block");
    }
	
	}
}