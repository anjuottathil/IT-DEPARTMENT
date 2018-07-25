import java.util.*;
class rectangle
{	int length;
	int breadth;
	rectangle(int l,int b)
	{	length=l;
		breadth=b;
	}
	void area()
	{	int d;
		d=length*breadth;
		System.out.println("area is" +d);
	}
}
class myrectangle
{	public static void main(String args[])
	{	int l;
		int b;
		Scanner c=new Scanner(System.in);
		System.out.println("enter the values:");
		l=c.nextInt();
		b=c.nextInt();
		rectangle r=new rectangle(l,b);
		r.area();
	}
}
