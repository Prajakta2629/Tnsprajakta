package com.tns.operator;

public class LogicalOprator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a=3,b=4;
		boolean res=(a>b && b<a);
		boolean res1=(a>b || b<a);
		boolean res2=(a>b != b<a);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);

	}

}
