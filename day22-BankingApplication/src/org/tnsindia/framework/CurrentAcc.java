package org.tnsindia.framework;

public class CurrentAcc extends BankAcc {
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
 
	public void withdraw(float accBal)
	{
		System.out.println("Account No:"+this.getAccNo()+","+"\nAccount name:"+this.getAccNm()+"," + "\nAccount Balance is:"+(accBal+ creditLimit));
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	

}
