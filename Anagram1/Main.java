import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		char ch[]=new char[A.length()];
		char ch1[]=new char[A.length()];
		char temp;
		if(A.length()!=B.length())
			System.out.println("Not Anagram");
		else
		{
			A.toLowerCase();
			B.toLowerCase();
			ch=A.toCharArray();
			ch1=B.toCharArray();
			Arrays.sort(ch);
			A=new String(ch);
			for(int i=0;i<A.length();i++)
				for(int j=i+1;j<A.length();j++)
					if(B.charAt(i)>B.charAt(j))
					{
						temp=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;
					}
			B=new String(ch1);
			if(A.equals(B))
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
	}
}
