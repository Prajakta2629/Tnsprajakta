package org.tnsindia.Array;
import java.util.Arrays;

public class UsingArray {

	static void display(int...a)
	{
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
        display(12,23,45,23,78,56,54);
	}

}
