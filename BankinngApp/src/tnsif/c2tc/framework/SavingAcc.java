package tnsif.c2tc.framework;

public class SavingAcc extends BankAcc {
	public SavingAcc(int accno, String accname, float accBal) {
		super(accno, accname, accBal);
		// TODO Auto-generated constructor stub
	}

	private static boolean isSalary=true;

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getAccno()=" + getAccno() + ", getAccname()=" + getAccname()
				+ ", getAccBal()=" + getAccBal() +  "]";
	}
	

}
