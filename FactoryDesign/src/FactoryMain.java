import company.phone.Android;
import company.phone.OS;
import company.phone.OperatingSystemFactory;
import company.phone.Windows;

public class FactoryMain 
{
	public static void main(String arg[])
	{
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj= osf.getInstance("Open");
		obj.spec();
		
	     
		
	}

}
