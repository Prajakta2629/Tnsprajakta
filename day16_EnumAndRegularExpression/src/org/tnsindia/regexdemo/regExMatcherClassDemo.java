package org.tnsindia.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExMatcherClassDemo {

	public static void main(String[] args) {
		
	Pattern p=Pattern.compile("Prajakta");
	Matcher m=p.matcher("My name is prajakta");
	
	while(m.find())
	{
		 System.out.println("Pattern found at:"+m.start()+" "+m.end());
	}

	}

}
