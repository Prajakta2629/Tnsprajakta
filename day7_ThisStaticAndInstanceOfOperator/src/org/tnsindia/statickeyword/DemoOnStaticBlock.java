package org.tnsindia.statickeyword;

public class DemoOnStaticBlock {

	static int a=10;
	static int b=20;
	static {
		 b=a+50;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("value of a:"+a);
       System.out.println("value of b:"+b);
	}

}
