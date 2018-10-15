import java.util.*;
class WeekDay
{
	public static void main(String args[])
	{
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day Number b/w 1-7 :");
		day=sc.nextInt();
		if(day==1)
			System.out.println("HAVE A NICE DAY !!");
		else if(day>1 && day<7)
			System.out.println("Welcome Back to the working DAY !!");
		else if(day==7)
			System.out.println("HAVE A Nice Weekend !!");
		else
			System.out.println("Enter valid day number");
	}
}