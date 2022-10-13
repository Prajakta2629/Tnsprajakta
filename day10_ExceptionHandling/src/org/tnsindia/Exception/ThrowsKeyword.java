package org.tnsindia.Exception;

import java.io.IOException;

public class ThrowsKeyword {
	public static void print (int x)throws IOException,ClassNotFoundException
	{
		if(x==1)
		{
			throw new IOException("IOException Occured");
		}
		else
		{
			throw new ClassNotFoundException("ClassNotFoundException Occured");	
		}
	}


	public static void main(String[] args) {
		try {
			print(5);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
}
}