package tnsif.c2tc.framework;

public class ShopAcc {
	private int accno;
	private String accname;
	private float charges;
	
	
	public ShopAcc(int accno, String accname, float charges) {
		this.accno = accno;
		this.accname = accname;
		this.charges = charges;
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
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public void bookProducts(float charges)
	{
		System.out.println("The charge of the product is"+charges);
	}
	public void items(float charges)
	{
		System.out.println("The product's charges are"+charges);
	}
	@Override
	public String toString() {
		return "ShopAcc [accno=" + accno + ", accname=" + accname + ", charges=" + charges + "]";
	}
	

}
