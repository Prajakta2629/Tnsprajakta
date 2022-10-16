package org.tnsindia.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<Object> s=new LinkedHashSet<>();
        s.add("Prajakta");
        s.add('p');
        s.add(34.67f);
        s.add(45);
        s.add(null);
        s.add(null);
        
        for(Object itr:s)
        {
        	System.out.println(itr);
        }
        System.out.println("THe elements in the set are:"+s); 
	}

}

