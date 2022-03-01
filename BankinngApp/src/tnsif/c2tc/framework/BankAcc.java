package tnsif.c2tc.framework;

public class BankAcc {
	private int accno;
	private String accname;
	private float  accBal;
	
	
	public BankAcc(int accno, String accname, float accBal) {
		this.accno = accno;
		this.accname = accname;
		this.accBal = accBal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("ThE accBal of the withdraw is" +accBal);
	}
	public void deposite(float accBal)
	{
		System.out.println("The deposite of accBal are" +accBal);
	}
	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accname=" + accname + ", accBal=" + accBal + "]";
	}

}
