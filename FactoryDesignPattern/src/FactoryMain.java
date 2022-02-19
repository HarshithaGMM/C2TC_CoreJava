
public class FactoryMain
{
	public Food getFood(String order)
	{
		if(order == null)	
		return null;
		else if(order.equalsIgnoreCase("cake"))
			return  new Cake();
		else if(order.equalsIgnoreCase("Pizza"))
			return new Pizza();
		else
			return null;
		
	}

}
