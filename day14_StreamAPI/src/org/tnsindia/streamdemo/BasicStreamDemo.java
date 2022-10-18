package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("Prajakta","Tejal","Disha");
		obj.forEach((i)->System.out.println(i+" "));
		System.out.println(obj);
		List<Integer>obj1=Arrays.asList(new Integer[] {56,97,34,81}); 
		obj1.forEach((i)->System.out.println(i+" "));
	}

}
