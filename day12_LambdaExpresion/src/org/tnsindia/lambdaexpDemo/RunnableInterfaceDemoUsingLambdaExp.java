package org.tnsindia.lambdaexpDemo;

public class RunnableInterfaceDemoUsingLambdaExp {

	public static void main(String[] args) {
		/*
		{
			@Override
			public void run() {
				System.out.println("Implementing runnabale interface");
							}			
		};
				Thread t=new Thread(obj);
		
		t.start();*/				
		Runnable obj=()->
		{
			System.out.println("Implementing runnabale interface");
		};
		Thread t=new Thread(obj);
		t.start();
	}

}
