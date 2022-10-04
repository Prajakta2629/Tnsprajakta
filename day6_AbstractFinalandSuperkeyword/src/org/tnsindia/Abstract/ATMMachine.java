package org.tnsindia.Abstract;


abstract class A
{
	abstract void print();
}
class B extends A
{
	void print() {
		int balance=50000;
	
	System.out.println("Account Balance is:"+balance);
}
}
public class ATMMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a=new B();
		a.print();
	}

}
