package wiproTalent;
import java.util.Scanner;
public class MostFrequentDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int inp1=sc.nextInt();
		int inp2=sc.nextInt();
		int inp3=sc.nextInt();
		int inp4=sc.nextInt();
		System.out.println(mfd(inp1,inp2,inp3,inp4));

	}
	public static int mfd(int inp1,int inp2,int inp3,int inp4)
	{
		int []arr=new int[10];
		fun(inp1,arr);
		fun(inp2,arr);
		fun(inp3,arr);
		fun(inp4,arr);
		int idx=0,max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=max)
			{
				max=arr[i];
				idx=i;
			}
		}
		return idx;
		
	}
	public static void fun(int num,int []arr)
	{
		while(num!=0)
		{
			int rem=num%10;
			int pv=arr[rem];
			arr[rem]=pv+1;
			num/=10;
		}
	}

}
