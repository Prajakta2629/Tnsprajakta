package org.tnsindia.inheritance;

import java.util.Scanner;

class Animal
{
      protected String name;
      public void display()
     {
	    System.out.println("The Animal is:"+name);
     }

}
class Dog extends Animal
{
      protected String Breed;
      public void print()
     {
	    System.out.println("The Dog Breed is:"+Breed);
     }

}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("Enter The name of animal:");
        String name1=s.nextLine();
        System.out.println("Enter The Breed of animal:");
        String Breed1=s.nextLine();
        Dog d=new Dog();
        d.Breed=Breed1;
        d.name=name1;
        d.display();
        d.print();
        

	}

}
