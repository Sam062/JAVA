import java.util.Scanner;
import static javafx.application.Platform.exit;
class Assignment1
{
	static double pi=3.14159;
	public static void main(String args[])
	{
		int choice1=1;
		while(choice1==1)
		{
		System.out.println("Enter choice :[1]-Execute ASSINMENT\t [2]-exit");
		Scanner sc=new Scanner(System.in);
		choice1=sc.nextInt();
		switch(choice1)
		{
			case 1:
			ass1();
			break;
			case 2:
			choice1=0;
			break;
			default:
			System.out.println("ENTER VALID CHOICE !!");
		}
		}
	}
	private static void ass1()
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice \n [1]-CIRCLE AREA\n [2]-CIRCLE PERIMETER\n [3]-RECT AREA\n [4]-RECT PERIMETER\n [5]-EVEN ODD NUMBER\n [6]-FACTORIAL\n [7]-REVERSE NUMBER\n [8]-SWAPPING\n [9]-SWAPPING without TEMP");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			circlearea();
			break;
			case 2:
			circleper();
			break;
			case 3:
			rectarea();
			break;
			case 4:
			rectperi();
			break;
			case 5:
			evenodd();
			break;
			case 6:
			factorial();
			break;
			case 7:
			revnum();
			break;
			case 8:
			swap();
			break;
			case 9:
			swaptemp();
			break;
			default:
			System.out.println("ENTER VALID CHOICE !!");
		}
	}
	    private static void circlearea()
		{
        int radius;
        double result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius >> ");
        radius=sc.nextInt();
        System.out.println("(Area of Circle=pi * r * r)");
        result=pi*radius*radius;
        System.out.println("Area of Circle="+result);
		}
		private static void circleper()
		{
		int radius;
		double per=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius >>");
		radius=sc.nextInt();
		per=2*pi*radius;
		System.out.println("(c=2*pi*radius)");
		System.out.println("Perimeter of Circle="+per);
		}
		private static void rectarea()
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
		private static void rectperi()
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
		private static void evenodd()
		{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER >>");
		num=sc.nextInt();
		if(num%2==0)
		System.out.println("EVEN NUMBER");
		else
		System.out.println("ODD NUMBER");
		}
		private static void factorial()
		{
		int num,fact=1,num1;;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER >>");
		num=sc.nextInt();
		num1=num;
		if(num==1)
			System.out.println("FACTORIAL of 1=1");
		else
		{
		while(num>0)
		{
			fact=fact*num;
			num=num-1;
		}	
		System.out.print("FACTORIAL OF" +num1);
		System.out.println(" is :" +fact);
		}
		}
		private static void revnum()
		{
		int num,res,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER >>");
		num=sc.nextInt();
		while(num>0)
		{
			res=num%10;
			rev=rev*10+res;
			num=num/10;
		}
		System.out.println("REVERSE OF Num is :" +rev);
		}
		private static void swap()
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
		private static void swaptemp()
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