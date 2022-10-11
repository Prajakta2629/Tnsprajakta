package org.tnsindia.Interfaceexample;
import java.util.Scanner;
interface InterfaceOuter
{

	void print();
		interface InnerInterface
	{
		void display();
	}
}
class ImplementableClass implements org.tnsindia.Interfaceexample.InterfaceOuter.InnerInterface
{

	public void display() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the batch: ");
		String str=s.nextLine();
		System.out.println("The batch is: "+str);
		
	}
	
}
class ImplementableClassP implements InterfaceOuter
{
	public void print() {
		System.out.println("Working on Nested Interface");
		
	}
}
public class NestedInterfaceDemo {

	public static void main(String[] args) {
		ImplementableClass i=new ImplementableClass();
		i.display();
		ImplementableClassP i1=new ImplementableClassP();
		i1.print();

	}

}