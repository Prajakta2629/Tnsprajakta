package org.tnsindia.inheritance;


class Vehicle
{
      protected String name="Car";
      public void display()
     {
	    System.out.println(name);
     }

}
class BMW extends Vehicle
{
      protected String name1="BMW";
      public void display1()
     {
	    System.out.println(name1);
     }

}
class Tyre extends BMW
{
      protected String tyrename="BridgeStone";
      public void display2()
     {
	    System.out.println(tyrename);
     }

}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tyre t=new Tyre();
		t.display();
		t.display1();
		t.display2();



	}

}
