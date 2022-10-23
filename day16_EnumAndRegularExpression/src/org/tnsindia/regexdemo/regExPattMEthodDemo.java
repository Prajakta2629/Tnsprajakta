package org.tnsindia.regexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class regExPattMEthodDemo {

	public static void main(String[] args) {
		String pattern="Prajakta Karve";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Input for matching:");
		String input=s.nextLine();
		
        boolean result=Pattern.matches(pattern, input);
        System.out.println(result);
	

	}

}
