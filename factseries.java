import java.util.*;
class sum
{
	void sumofseries()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: "); 
		int n = sc.nextInt();
		double sum=0.0;
		double fact=1.0;
		System.out.println("\nThe series is: ");
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			sum=sum+i/fact;
			System.out.print(i+"/"+i+"!");
			if(i<n)
				System.out.print(" + ");
		}
		System.out.print("\nSum: "+sum);
	}
	
} 
class factseries
{
	public static void main(String args[])
	{
		sum ob=new sum();
		ob.sumofseries();
	}
}