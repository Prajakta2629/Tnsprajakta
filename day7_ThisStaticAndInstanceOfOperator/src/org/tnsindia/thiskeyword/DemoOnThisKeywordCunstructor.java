package org.tnsindia.thiskeyword;

class B
{
	public String name;
	public int id;
	B(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public void print()
	{
		System.out.println("The name is:"+name);
		System.out.println("The ID is:"+id);
	}
}

public class DemoOnThisKeywordCunstructor{

	public static void main(String[] args) {
		B a=new B("Prajakta",121);
		a.print();

	}

}

