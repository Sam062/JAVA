import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		int num=5,fact=1;
		while(num>0)
		{
			fact=fact*num;
			num-=1;
		}
		System.out.println("factorial=" +fact);
	}
}