package org.tnsindia.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	
		public static void main(String[] args) {
			@SuppressWarnings("rawtype")
			List list=new LinkedList<>();
			list.add(1);
			list.add("Prajakta");
			list.add(34.43f);
			System.out.println("the element are: "+list);
			System.out.println(list.size());
			}


	}

