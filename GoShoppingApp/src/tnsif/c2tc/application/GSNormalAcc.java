package tnsif.c2tc.application;

import tnsif.c2tc.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bookProducts(float charges) {
		System.out.println("You have purcheser the product with charges is"
	                          +charges+" along with delivery charges"
				             +deliverycharges);
		
	}

}
