import java.util.*;
class asciiloweupper
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter the string: ");
		str=sc.nextLine();
		int ll=122;
		int hl=97;
		int lu=90;
		int hu=65;
		for(int i=0;i<str.length();i++)
		{
			int asc=(int)str.charAt(i);
			if(asc>=97 && asc<=122)
			{
				if(asc<ll)
					ll=asc;
				if(asc>hl)
					hl=asc;
			}
			else if(asc>=65 && asc<=90)
			{
				if(asc<lu)
					lu=asc;
				if(asc>hu)
					hu=asc;
			}
		}
		char llc=(char)ll;
		char hlc=(char)hl;
		char luc=(char)lu;
		char huc=(char)hu;
		System.out.print("\nThe character with lowest ASCII code in lower case is "+llc);
		System.out.print("\nThe character with highest ASCII code in lower case is "+hlc);
		System.out.print("\nThe character with lowest ASCII code in upper case is "+luc);
		System.out.print("\nThe character with highest ASCII code in upper case is "+huc);
	}
}