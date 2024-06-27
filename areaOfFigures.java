import java.util.*;
class find_area
{
	double ar;
	find_area()
	{
		ar=0.0;
	}
	void area(double r)
	{
		ar=3.14*r*r;
		System.out.print("The area of a circle is: "+ar);
	}
	void area(double l,double br)
	{
		ar=l*br;
		System.out.print("\nThe area of a rectangle is: "+ar);
	}
	void area(double bs,double h,double half)
	{
		ar=half*bs*h;
		System.out.print("\nThe area of a triangle is: "+ar);
	}
}
class areaOfFigures
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		find_area ob=new find_area();
		System.out.print("Enter the radius of a circle: ");
		double r=sc.nextDouble();
		System.out.print("\nEnter the length of a rectangle: ");
		double l=sc.nextDouble();
		System.out.print("\nEnter the breadth of a rectangle: ");
		double br=sc.nextDouble();
		System.out.print("\nEnter the base of a triangle: ");
		double bs=sc.nextDouble();
		System.out.print("\nEnter the height of a triangle: ");
		double h=sc.nextDouble();
		ob.area(r);
		ob.area(l,br);
		ob.area(bs,h,0.5);
		
	}
}