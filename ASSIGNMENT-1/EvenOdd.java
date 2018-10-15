import java.util.Scanner;
class EvenOdd
{
	public static void main(String args[])
	{
		function();
	}
		private static void function()
		{
			int num;
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER NUMBER >>");
			num=sc.nextInt();
			if(num%2==0)
			{
				System.out.println("EVEN NUMBER");
			}
			else
			{
				System.out.println("ODD NUMBER");
			}
		}
}