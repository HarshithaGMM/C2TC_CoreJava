package tnsif.c2tc.framework;

public interface ShopFactory {
	public PrimeAcc getNewPrimeAccount(int accno, String accname, float charges);
	public NormalAcc getNewNormalAccount(int accno, String accname, float charges);

}
