import java.util.*;
class details
{
	String name;
	int acc;
	double balance;
	details(String n,int ac,double bal,double initial)
	{
		name=n;
		acc=ac;
		if(initial<50)
		{
			System.out.println("Balance is less then 50 : "+initial);
			balance=initial;
		}
		else
			balance=bal+initial;
	}
}
public class Account
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Name of the Depositer :");
	String name=sc.nextLine();
	System.out.print("Enter Acc Number :");
	int acc=sc.nextInt();
	System.out.print("Enter balance to Deposit :");
	double bal=sc.nextDouble();
	System.out.print("Enter initial balance in account :");
	double initial=sc.nextDouble();
	details A=new details(name,acc,bal,initial);
	System.out.print("\nName :"+A.name+"\nAcc Number : "+A.acc+"\nBalance :"+A.balance);
	}
}
