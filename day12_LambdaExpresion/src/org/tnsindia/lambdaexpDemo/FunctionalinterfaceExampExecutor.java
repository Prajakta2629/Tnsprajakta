package org.tnsindia.lambdaexpDemo;

public class FunctionalinterfaceExampExecutor {

	public static void main(String[] args) {
		FunctionalInterfaceExample obj=(int a,int b)->
		{
			int result=(a>b)?a:b;
			
			//System.out.println("The maximum number is:" +result);
			return result;
			
		};
		System.out.println("The maximum number is:" +obj.max(34, 67));

	}

}
