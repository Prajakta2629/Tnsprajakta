package org.tnsindia.ComparatorDemo;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int emp1_age=((Employee) o1).getAge();
		int emp2_age=((Employee) o2).getAge();
		if(emp1_age>emp2_age)
		{
			
			System.out.println("Employee one is greater");
		}
		else if(emp1_age<emp2_age)
		{
			
			System.out.println("Employee two is greater");
		}
		else 
		{
			
			System.out.println("Both are Equal");
		}
		
				return 0;
	}
	

	

}
