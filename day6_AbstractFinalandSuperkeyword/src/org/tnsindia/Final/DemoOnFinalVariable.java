package org.tnsindia.Final;

class FinalVariable
{
	public final float salary=200000;
	/*void display()
	{
		salary=300000;
	}*/
	
}

public class DemoOnFinalVariable {

	public static void main(String[] args) {
		FinalVariable f1=new FinalVariable();
		System.out.println(f1.salary);
	}

}