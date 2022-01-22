import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		System.out.println(A.length()+B.length());
		if(A.compareTo(B)>0)
			System.out.println("YES");
		else
			System.out.println("NO");
		System.out.println(A.substring(0,1).toUpperCase()+
				           A.substring(1)+ " "+
				           B.substring(0,1).toUpperCase()+
				           B.substring(1));	
	}
}
