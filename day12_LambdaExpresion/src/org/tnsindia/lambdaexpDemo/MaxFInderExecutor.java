package org.tnsindia.lambdaexpDemo;

public class MaxFInderExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MaxFInderExecutor d=new MaxFInderExecutor();
		d.max(45,17);*/
		/*MaxFinderDemo obj=(int a,int b)->
		{
			int result=(a>b)?a:b;
			
			System.out.println("The maximum number is:" +result);
		};
		obj.max(13, 98);*/
		
		
		MaxFInderDemo obj=(a,b)->a>b?a:b;
		System.out.println("The maximum no.is: " +obj.max(25, 6));

	}
        
	}
