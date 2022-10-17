package org.tnsindia.lambdaexpDemo;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambdaDemo {

	public static void main(String[] args) {
		FileFilter filter=(File pathname)->pathname.getName().endsWith(".txt");
		File dir=new File("C:\\Users\\DELL\\OneDrive\\Documents\\Python Course with Notes\\9. Chapter 9");
		File contents[]=dir.listFiles(filter);
		for(File itr:contents)
		{
			System.out.println(itr);
		}

	}

}
