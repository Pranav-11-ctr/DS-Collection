package wiproTalent;
import java.util.Scanner;
public class WeightOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int input=sc.nextInt();
		str=str.toLowerCase();
		int vsum=0,csum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vsum=vsum+(ch-'a'+1);
				}
				else
				{
					csum=csum+(ch-'a'+1);
				}
			}
		}
		if(input==0)
			System.out.println(csum);
		else if(input==1)
		System.out.println(csum+vsum);
	}
}
