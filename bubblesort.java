import java.util.*;
class sort
{
	void display(int array[],int s)
	{
		for(int k=0;k<s;k++)
		{
			System.out.print(array[k]+" ");
		}
	}
	void bubble(int a[],int size)
	{
		int n;
		System.out.print("Array before sorting: ");
		display(a,size);
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("\nArray after sorting: ");
		display(a,size);
	
		
	}
}
class bubblesort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sort ob=new sort();
		ob.bubble(arr,n);
		
	}
}
