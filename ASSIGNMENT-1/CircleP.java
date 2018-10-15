import java.util.Scanner;
class CircleP
{
	public static void main(String args[])
	{
		circleper();
	}	
	private static void circleper()
	{
		int radius;
		double pi=3.14,per=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius >>");
		radius=sc.nextInt();
		per=2*pi*radius;
		System.out.println("(c=2*pi*radius)");
		System.out.println("Perimeter of Circle="+per);
	}
}