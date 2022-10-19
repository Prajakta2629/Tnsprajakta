package org.tnsindia.generics;

public class GenericMethodExample
{
    public static <E> void printArray(E[] elem)
    {
    	for(E itr:elem)
    	{
    		 System.out.println(itr.getClass().getName());
    		System.out.println(itr);
    	}
    }
	public static void main(String[] args) {
		Integer [] arr1= {10,20,30};
		Character [] arr2= {'z','x','a'};
		System.out.println("Printing arrays for Integer");
		printArray(arr1);
		System.out.println("Printing arrays for Character");
		printArray(arr2);
	}

}
