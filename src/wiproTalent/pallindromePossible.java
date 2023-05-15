package wiproTalent;
import java.util.Scanner;
public class pallindromePossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(fun(n));

	}
	public static int fun(int n)
	{
		int opval=0;
		int[] arr=new int[10];
		int nod=0;
		int temp=n;
		int noodd=0;
		while(temp!=0)
		{
			int rem=temp%10;
			int pv=arr[rem];
			arr[rem]=pv+1;
			nod++;
			temp/=10;
		}
		if(nod%2==0)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2==0)
				{
				}else
				{
					return 1;
				}
			}
			opval=2;
		}
		else if(nod%2!=0)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2!=0)
					noodd++;
				if(noodd>1)
					return 1;
			}
			opval=2;
		}
		return opval;
	}

}
