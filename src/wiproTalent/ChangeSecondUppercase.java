package wiproTalent;
import java.util.Scanner;
public class ChangeSecondUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		
		System.out.println(fun(str));
		

	}
	public static String fun(String str)
	{
	    
		String outputstr=""; 
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				int j=i+1;
				while(j<str.length() && str.charAt(j)!=' ')
				{
					outputstr=outputstr+Character.toUpperCase(str.charAt(j));
					j++;
				}
				//System.out.println(outputstr);
				 break;
			}
		}
		if(outputstr=="")
		return "LESS";
		return outputstr;
		
	}

}
