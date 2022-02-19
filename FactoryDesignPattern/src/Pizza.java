import java.util.Scanner;

public class Pizza implements Food
{

	@Override
	public String getType() {
		return "Someone orderd a Fast Food";
	}
	public class Solution {

	    public static void main(String args[]) {
	        Do_Not_Terminate.forbidExit();

	        try {

	            @SuppressWarnings("resource")
	            Scanner sc = new Scanner(System.in);
	            // creating the factory
	            FoodFactory foodFactory = new FoodFactory();

	            // factory instantiates an object
	            Food food = foodFactory.getFood(sc.nextLine());

	            System.out.println("The factory returned " + food.getClass());
	            System.out.println(food.getType());
	        } catch (Do_Not_Terminate.ExitTrappedException e) {
	            System.out.println("Unsuccessful Termination!!");
	        }
	    }

	}

}
