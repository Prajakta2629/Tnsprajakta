package org.tnsindia.Final;




class FinalClass
{
	protected String name="Prajakta";
}

/*final class FinalClass
{
	protected String name="Prajakta";
}*/

class ChildFinal extends FinalClass
{
	public void print()
	{
		System.out.println(name);
	}
}

public class DEmoOmFinalClass {

	public static void main(String[] args) {
		ChildFinal c=new ChildFinal();
		c.print();

	}

}