import java.util.*;
class SwapTemp
{
	public static void main(String args[])
		{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER a >>");
		a=sc.nextInt();
		System.out.println("ENTER b >>");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("AFTER SWAPPING : a=" +a);
		System.out.println("AFTER SWAPPING : b=" +b);
		}
}