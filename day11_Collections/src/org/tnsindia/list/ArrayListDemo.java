package org.tnsindia.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		@SuppressWarnings("rawtype")
		List list=new ArrayList<>();
		list.add(1);
		list.add("Prajakta");
		list.add(34.43f);
		System.out.println("the element are: "+list);
		System.out.println(list.size());
		}

}
