package tnsif.c2tc.framework;

public class PrimeAcc extends ShopAcc {
	public PrimeAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}
	private static boolean isprime=true;

	public boolean isIsprime() {
		return isprime;
	}

	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}


	@Override
	public String toString() {
		return "PrimeAcc [isprime=" + isprime + ", getAccno()=" + getAccno() + ", getAccname()=" + getAccname()
				+ ", getCharges()=" + getCharges() +  "]";
	}
		

}
