package org.tnsindia.list;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("J2EE");
		list.add("JSP");
		list.add("Java");
		list.add("Servelet");
		list.add("Java");
		list.add("STRUPS");
		System.out.println(list);
		System.out.println(list.indexOf("Java"));
		System.out.println(list.lastIndexOf("Java"));
		
	

}
}