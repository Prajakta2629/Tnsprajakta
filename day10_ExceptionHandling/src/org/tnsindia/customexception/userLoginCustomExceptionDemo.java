package org.tnsindia.customexception;

import java.util.Scanner;

class LoginCredential extends Exception
{
	public String str;
	public  LoginCredential(String str) {
		super();
		this.str=str;
	}
	public String toString() {
		return "LoginCredential [str=" + str + "]";
		
	}
}

public class userLoginCustomExceptionDemo {

	public void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String id=s.nextLine();
        String password=s.nextLine();
        try {
        	if(id!="prajaktakarve2000@gmail.com" && password!="abc@123")
        throw new LoginCredential("Invalid Credentials");
			
		}
		catch(LoginCredential e)
		{
			System.out.println("Exception Handled "+e);
		}
        }
}
