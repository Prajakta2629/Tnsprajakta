package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(141414, "Prajakta Karve", 1000, true);
		CurrentAcc n=new MMCurrentAcc(151515, "Vaibhav Karve", 20000, 10000);
		System.out.println();
		System.out.println("Saving Account Details:");
		p.withdraw(p.getAccBal());
		System.out.println();
		System.out.println("Current Account Details:");
		n.withdraw(n.getAccBal());
		System.out.println();
		System.out.println(p);
		System.out.println(n);

	}

}
