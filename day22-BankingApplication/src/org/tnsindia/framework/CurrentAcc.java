package org.tnsindia.framework;

public class CurrentAcc extends BankAcc {
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
 
	public void withdraw(float charges)
	{
		System.out.println("Account No:"+this.getAccNo()+","+"Account name:"+this.getAccNm()+"," + "Account Balance is:"+(getAccBal()+creditLimit));
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	

}
