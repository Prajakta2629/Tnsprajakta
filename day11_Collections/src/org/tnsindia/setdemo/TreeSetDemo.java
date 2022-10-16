package org.tnsindia.setdemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SortedSet<Object> s=new TreeSet<>();
        s.add("Prajakta");
		s.add("TEjal");
		s.add("Disha");
		
		s.add("Prajakta");
		//s.add(null);
		//s.add(null);
		System.out.println("The elements in the TreeSet are: "+s);
	}

}
