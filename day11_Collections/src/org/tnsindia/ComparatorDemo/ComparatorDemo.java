package org.tnsindia.ComparatorDemo;
import java.util.Arrays;

public class ComparatorDemo{

	public static void main(String[] args) {
		
         Employee emp[]=new Employee[2];
         
         emp[0]=new Employee();
         emp[0].setAge(22);
         emp[0].setName("Praju");
         
         emp[1]=new Employee();
         emp[1].setAge(25);
         emp[1].setName("Teju");
         
         for(int i=0;i<emp.length;i++)
         {
        	 System.out.println("Employee"+(i+1)+" "+"Name:  "+emp[i].getName()+"  "+emp[i].getAge());
         }

         
         Arrays.sort(emp,new AgeComparator());
          
                  
         
	}

}