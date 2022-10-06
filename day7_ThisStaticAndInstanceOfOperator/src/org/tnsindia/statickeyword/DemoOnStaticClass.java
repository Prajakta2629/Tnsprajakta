package org.tnsindia.statickeyword;

class C
{
	public static String str="TNS INDIA";
	static class D
	{
		public static void print() 
		{
			System.out.println(str);
		}
	}
}

public class DemoOnStaticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //  C.D obj= new org.tnsindia.statickeyword.C.D();
       //obj.print();
	    C.D.print();
	}

}
