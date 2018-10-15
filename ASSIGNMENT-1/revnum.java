import java.util.*;
class revnum
{
	public static void main(String args[])
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
}	