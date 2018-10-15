import java.util.*;
class SumOdd
{
	public static void main(String args[])
	{
		int from,to,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range from:");
		from=sc.nextInt();
		System.out.println("To:");
		to=sc.nextInt();
		for(int i=from; i<=to; i++)
		{
			if(i%2!=0)
				sum=sum+i;
		}
		System.out.println("\nSum of Odd numbers from "+from+" to "+to+" is="+sum);
		
	}
}