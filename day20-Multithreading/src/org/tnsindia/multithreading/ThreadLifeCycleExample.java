package org.tnsindia.multithreading;

public class ThreadLifeCycleExample implements Runnable {

	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.start();
	//	t1.start();
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Exception Handled"+e);			
		}
         t1.setPriority(1);
         int priority=t1.getPriority();
         System.out.println(priority);
	}

	@Override
	public void run() {
		
		
	}

}
