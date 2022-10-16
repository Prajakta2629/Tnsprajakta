package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		Collection obj =new ArrayList<>();
		obj.add("Prajakta");
		obj.add('x');
		obj.add(87.90f);
		System.out.println("The Element in Collection are:"+obj);

	}

}
