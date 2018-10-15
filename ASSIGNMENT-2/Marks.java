import java.util.*;
class Marks
{
	public static void main(String args[])
	{
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter MARKS b/w 0-100 :");
		mark=sc.nextInt();
		if(mark<40)
			System.out.println("FAIL :( !!");
		else if(mark>=40 && mark<50)
			System.out.println("Just Pass!!");
		else if(mark>=50 && mark<75)
			System.out.println("GOOD !!");
		else if(mark>=75 && mark<90)
			System.out.println("VERY GOOD !!");
		else if(mark>=90 && mark<=100)
			System.out.println("Excellent !!");
		else if(mark>100)
			System.out.println("KUCHH TO GADBAD HAI :D");
	}
}