package org.tnsindia.setdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		//Set s= new Set<>();
		Set s= new HashSet<>();
		s.add("Prajakta");
		s.add('s');
		s.add(34.7f);
		s.add(78);
		s.add("Prajakta");
		s.add(null);
		s.add(null);
		
       System.out.println("The elements in the Set are: "+s);
	}

}
