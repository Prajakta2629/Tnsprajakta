package org.tnsindia.inheritance;

class AndroidVersion
{
      protected String name="Android latest version";
      public void display()
     {
	    System.out.println(name);
     }

}
class Tiramisu extends AndroidVersion
{
      protected String v13="Tiramisu";
      public void display()
     {
	    System.out.println(v13);
     }

}
class SnowCone extends AndroidVersion
{
      protected String v12="SnowCone";
      public void display()
     {
	    System.out.println(v12);
     }

}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiramisu t=new Tiramisu();
		t.display();
		SnowCone s=new SnowCone();
		s.display();
		

	}

}
