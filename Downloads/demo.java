class square
{	int side;
	void area(int a)
	{	side=a;
		int ar;
		ar=a*a;
		System.out.println("area is" +ar);
	}
}
class rectangle
{	int length;
	int breadth;
	void area(int l,int b)
	{	length=l;
		breadth=b;
		int ar;
		ar=length*breadth;
		System.out.println("area is" +ar);
	}
}
class demo 
{	public static void main(String[] args)
	{	square s=new square();
		s.area(5);
		rectangle r=new rectangle();
		r.area(3,4);
	}
}
