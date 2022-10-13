package org.tnsindia.Exception;

public class ThrowKeyword {
    public static void display(int age,int weight)
    {
    	if(age>16 && weight>45)
    	{
    		System.out.println("Eligible to donate the blood");
    	}
    	else
    	{
    		throw new ArithmeticException("Not Eligible"); 
    		}
    }
	public static void main(String[] args) {
		try {
			display(20,30);
		}
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
