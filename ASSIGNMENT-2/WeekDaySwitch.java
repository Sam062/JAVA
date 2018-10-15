import java.util.*;
class WeekDaySwitch
{
	public static void main(String args[])
	{
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Day Number b/w 1-7 :");
		day=sc.nextInt();
		switch(day)
		{
			case 1:
				System.out.println("Have A Nice Day !!");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Welcome Back to The Working Day !!");
				break;
			case 7:
				System.out.println("Have A Nice Weekend !!");
				break;
			
			default:
				System.out.println("Plz enter a valid day no :");
		}
	}
}