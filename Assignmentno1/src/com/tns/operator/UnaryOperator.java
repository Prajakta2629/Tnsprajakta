package com.tns.operator;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=3;
        int x=a++;
        int y=++b;
        int z=a+x;
        System.out.println("Increment Operator is:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        int a1=5,b1=3;
        int x1=a--;
        int y1=--b;
        int z1=a-x;
        System.out.println("Decrement Operator is:");
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);

	}

}
