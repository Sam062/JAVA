import java.util.Scanner;
class RectArea
{
	public static void main(String args[])
	{
		area();
	}	
	private static void area()
	{
		double length,width,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length >>");
		length=sc.nextDouble();
		System.out.println("Enter width >>");
		width=sc.nextDouble();
		result=length*width;
		System.out.println("(area=length*width)");
		System.out.println("area of rectangle="+result);
	}
}