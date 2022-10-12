package org.tnsindia.Array;

import java.util.Scanner;

public class ArrayDemoUserInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter the size of array");
		int size=s.nextInt();
		int arr[]=new int[size];
		 System.out.println("Enter the value: ");
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.println("Enter the "+i+" index");
			 arr[i]=s.nextInt();
			
		 }
		/* for(int i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }*/
		 for(int j:arr)
		 {
			 System.out.println(j);
		 }

	}

}
