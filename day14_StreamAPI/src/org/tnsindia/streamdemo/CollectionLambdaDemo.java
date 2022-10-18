package org.tnsindia.streamdemo;

import java.util.HashSet;
import java.util.Set;

public class CollectionLambdaDemo {

	public static void main(String[] args) {
		Set<Integer>obj=new HashSet<>();
		obj.add(56);
		obj.add(45);
		obj.add(78);
		System.out.println(obj);
		/*for(Integer itr:obj) {
			System.out.println()
		}*/
		obj.forEach(System.out::println);

	}

}
