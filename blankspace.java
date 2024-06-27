import java.util.*;
class blankspace
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		String str2="";
		System.out.print("Enter the string: ");
		str=sc.nextLine();
		int b=0;
		char blank=' ';
		//System.out.print("\nYour String is ");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==blank)
			{
				b++;
				if(b>1)
					continue;
				else
					//System.out.print(" ");
					str2=str2+" ";
			}
			else
			{
				//System.out.print(str.charAt(i));
				str2=str2+str.charAt(i);
				b=0;
			}
		}
		System.out.print("\nYour String is "+str2);
		
	}
}