package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilteringMethodDemo {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer [] {56,67,81,45});
		obj1.stream().filter((i->i>45)).forEach((i)->System.out.println(i+" "));
		System.out.println();
		obj1.stream().distinct().forEach((i)->System.out.print(i+" "));
		System.out.println();
		obj1.stream().limit(3).forEach((i)->System.out.print(i+" "));
		System.out.println();
		obj1.stream().skip(4).forEach((i)->System.out.print(i+" "));
	}

}
