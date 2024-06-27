import java.util.*;
class EvenSeries
{
	Scanner sc=new Scanner(System.in);
	long n;
	float s;
	float k;
	EvenSeries()
	{
		n=0;
		s=0f;
		k=0f;
	}
	void accept()
	{
		s=sc.nextFloat();
	}
	long fact(long x)
	{
		long factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		return factorial;
	}
	void disp()
	{
		n=2;
		while(k!=s)
		{
			k=k+(float)(Math.pow(2,n)/fact(n));
			n++;
			//System.out.print(k);
		}
		System.out.print("\nThe term is: "+n);	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		EvenSeries ob=new EvenSeries();
		ob.accept();
		ob.disp();
	}
}