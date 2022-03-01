package tnsif.c2tc.application;

import tnsif.c2tc.framework.BankFactory;
import tnsif.c2tc.framework.CurrentAcc;
import tnsif.c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accno, String accname, float accBal) {
		SavingAcc sa=new SavingAcc(accno, accname, accBal);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal) {
		CurrentAcc ca=new CurrentAcc(accno, accname, accBal);
		return ca;
	}
	
}
