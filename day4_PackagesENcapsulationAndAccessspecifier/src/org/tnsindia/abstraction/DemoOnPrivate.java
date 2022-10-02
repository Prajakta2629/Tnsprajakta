package org.tnsindia.abstraction;

class A
{
	private float salary;
	
	float getSalary() {
		return salary;
	}
	
    public void setSalary(float salary) {
    	this.salary = salary;
    }
}

public class DemoOnPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.setSalary(5000);
		System.out.println("The salary is:"+a.getSalary());

	}

}
