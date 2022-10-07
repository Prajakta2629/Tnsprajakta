package org.tnsindia.overloading;

class MathematicalOperation
{
	public void addition(int a,int b)
	{
		
	System.out.println("The sum is:"+(a+b));
    }
	public void addition(float a,int b)
	{
		
	System.out.println("The sum is:"+(a+b));
    }
}





public class DemoOnMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathematicalOperation m=new MathematicalOperation();
		m.addition(10, 45);
		m.addition(12.0f, 33);
	}

}
