package com.tns.decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("Shrivalli");
			break;
		case 2:
			System.out.println("Hello");
			break;

		case 3:
			System.out.println("Rita");
			break;
        default:
        	System.out.println("Invalid Input");
        	s.close();
		}
		
	}

}