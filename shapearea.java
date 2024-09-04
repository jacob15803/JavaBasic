import java.util.*;
class shapearea
{
	public static void main(String args[])
	{
		Scanner io=new Scanner(System.in);
		int a1,b1;
		shape o1=new rect();	
		shape o2=new tri();
		shape o3=new cir();
		System.out.print("Enter first value:-");
		a1=io.nextInt();
		System.out.print("Enter second value:-");
		b1=io.nextInt();
		o1.printArea(a1,b1);
		o2.printArea(a1,b1);
		o3.printArea(a1,b1);
	}
}
abstract class shape
{
	int a,b;
	double c;
	abstract void printArea(int a,int b);
}
class rect extends shape
{
	void printArea(int a,int b)
	{
		c=a*b;
		System.out.println("\nRectangle area:"+c);
	}
}
class tri extends shape
{
	void printArea(int a,int b)
	{
		c=a*b*0.5;
		System.out.println("Triangle area:"+c);
	}
}
class cir extends shape
{
	void printArea(int a,int b)
	{
		c=a*a*3.14;
		System.out.println("Circle area:"+c);
	}
}
