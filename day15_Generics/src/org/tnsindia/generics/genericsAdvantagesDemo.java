package org.tnsindia.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class genericsAdvantagesDemo {

	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<>();
		obj.add(12);
		System.out.println(obj);
		List<Integer>obj2=new ArrayList<>();
		obj2.add(15);
	
		Integer d=obj2.get(0);
		System.out.println(obj2);
	}

}
