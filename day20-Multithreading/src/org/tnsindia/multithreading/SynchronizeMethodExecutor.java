package org.tnsindia.multithreading;

public class SynchronizeMethodExecutor {

	public static void main(String[] args) {
		SynchronizeMethodDemo m= new SynchronizeMethodDemo();
		Thread t1=new Thread(()->m.arraysum(new int[] {11,22,33}));
		Thread t2=new Thread(()->m.arraysum(new int[] {10,20,30}));
		t1.start();
		t2.start();

	}

}
