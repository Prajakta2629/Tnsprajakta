package org.tnsindia.Array;
public class Varargs {

	static void print(int a,int b,String...x)
	{
	    System.out.println(a+","+b);
	    for(int i=0;i<x.length;i++)
	    {
	    	System.out.println(x[i]+"\t");
	    }
	}
	
	public static void main(String[] args) {
		
        print(12,34,"Python","Java","C++");
	}

}
