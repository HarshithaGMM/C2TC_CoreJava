package tnsif.c2tc;

import tnsif.c2tc.application.MMBankFactory;
import tnsif.c2tc.application.MMCurrentAcc;
import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;
import tnsif.c2tc.application.MMSavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(123, "Harshitha", 10000);
		sa.withdraw(5000);
		CurrentAcc ca=new MMCurrentAcc(1234, "Ganavi", 0);
		ca.withdraw(5000);
		

	}

}
