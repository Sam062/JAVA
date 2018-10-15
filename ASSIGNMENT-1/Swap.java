import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER a >>");
		a=sc.nextInt();
		System.out.println("ENTER b >>");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("AFTER SWAPPING : a=" +a);
		System.out.println("AFTER SWAPPING : b=" +b);
	}
}