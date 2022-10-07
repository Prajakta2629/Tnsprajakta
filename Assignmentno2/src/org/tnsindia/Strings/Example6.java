package org.tnsindia.Strings;
import java.util.StringTokenizer;
public class Example6 {

	public static void main(String[] args) {
		StringTokenizer s1=new StringTokenizer("lets try this");
		while(s1.hasMoreTokens()) {
		System.out.println(s1.nextToken());
		//System.out.println(s1.nextToken());
		//System.out.println(s1.nextToken());
		}
		

	}

}
