class areaperi
{
	double ar,side,peri;
	areaperi()
	{
		ar=side=peri=0.0;
	}
	areaperi(int s)
	{
		side=s;
		ar=side*side;
		peri=4*side;
		System.out.println(ar+" "+peri);
	}
	
}
class areaPerisqu
{
	public static void main(String args[])
	{
		areaperi ob=new areaperi(5);
		
	}
}