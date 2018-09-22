import java.util.Scanner;
class RectPeri
{
	public static void main(String args[])
	{
		PeriRect();
	}	
	private static void PeriRect()
	{
		double length,width,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length >>");
		length=sc.nextDouble();
		System.out.println("Enter width >>");
		width=sc.nextDouble();
		result=length+width;
		System.out.println("perimeter of rect=2*(length+width)");
		System.out.println("perimeter of rectangle="+result*2);
	}
}