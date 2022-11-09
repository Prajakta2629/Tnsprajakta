package org.tnsindia.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalary;
	static final private float creditLimit=1000000f;
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	public void withdraw(float charges)
	{
		System.out.println("Account No:"+this.getAccNo()+","+"Account name:"+this.getAccNm()+","+"Account Balanceis:"+this.getAccBal());
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
	
}
