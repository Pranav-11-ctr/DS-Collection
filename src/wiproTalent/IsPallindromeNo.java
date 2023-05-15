package wiproTalent;
import java.util.Scanner;
public class IsPallindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int val=isPallindrome(n);
		System.out.println(val);

	}
	public static int isPallindrome(int n)
	{
		int temp=n;
		int newno=0;
		while(temp!=0)
		{
			int rem=temp%10;
			newno=newno*10+rem;
			temp/=10;
		}
		if(n==newno)
			return 2;
		else
			return 1;
	}

}
