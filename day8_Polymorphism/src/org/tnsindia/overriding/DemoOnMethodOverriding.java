package org.tnsindia.overriding;
import java.util.Scanner;
class HeadQuarters
{
	protected int totalemp;
	String city;
	Scanner s=new Scanner(System.in);
	public void getdetails()
	{
		System.out.println("enter the city where head quarters situated: ");
		city=s.nextLine();
		System.out.println("enter the total no of emp in that city head quarters: ");
		totalemp=s.nextInt();
	}
	public void showdetails()
	{
		System.out.println("Comapny is located in:" +city+" and total no of emp is:"+totalemp);
	}
	}
 class MainBranch extends HeadQuarters
 {
	 public int totalempMB;
	public String citynameMB;
	public void getdetails()
	{
		System.out.println("Head Quarters");
		super.getdetails();
		System.out.println("Main Branch");
		System.out.println("enter the city where mainbranch situated: ");
		s.nextLine();
		citynameMB=s.nextLine();
		System.out.println("enter the total no of emp in that city mainbranch: ");
		totalempMB=s.nextInt();
	}
	public void showdetails()
	{
		super.showdetails();
		System.out.println("Main Branch");
		System.out.println("Comapny is located in:" +citynameMB+" and total no of emp is:"+totalempMB );
	}
}
 
public class DemoOnMethodOverriding {

	public static void main(String[] args) {
		MainBranch m=new MainBranch();
		m.getdetails();
		m.showdetails();


	}

}
