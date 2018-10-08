import java.util.*;
public class Palendrome
{
	public static void main(String args[])
	{
	int num,i,sum=0,temp,rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number :");
	num=sc.nextInt();
	temp=num;
	while(temp>0)
		{
		rem=temp%10;
		sum=sum*10+rem;
		temp=temp/10;
		}
		if(num==sum)
			System.out.println("PALENDROME NUMBER !!");
		else
			System.out.println("NOT PALENDROME NUMBER !!");
	}
}