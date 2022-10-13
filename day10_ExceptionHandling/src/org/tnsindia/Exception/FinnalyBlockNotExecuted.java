package org.tnsindia.Exception;

public class FinnalyBlockNotExecuted {
	public static void print()
	{ 
		try {
		int x=12;
		int y=0;
		System.out.println("Inside Try block: "+x/y);
		System.exit(0);
	}
   catch(Exception e)
   {
	   System.out.println("Catch Block");
   }
   finally
	{
	   System.out.println("Finally block");
    }
	}
	public static void main(String[] args) {
		print();

	}

}
