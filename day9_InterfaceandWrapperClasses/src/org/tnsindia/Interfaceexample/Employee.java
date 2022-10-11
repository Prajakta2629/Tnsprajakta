package org.tnsindia.Interfaceexample;

public  class Employee implements HR,Manager{
	
	

	@Override
	public void Salarydiscussion() {
		System.out.println("About the salary discussion");
		
	}

	@Override
	public void Projectdiscussion() {
		System.out.println("About the project discussion");
		
	}


	}


