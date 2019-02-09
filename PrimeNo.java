
		// PRIME NUMBER

import java.util.Scanner;
public class PrimeNo
{
    public static void main(String[] args)
    {
        prime();
    }
private static void prime()
{
    int num,i,flag=0,ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter ANY NUMBER :");
    num=sc.nextInt();
    for(i=2;i<=num/2;i++)
    {
		flag=0;
        if(num%i==0)
            break;
        else
            flag=1;
    }
    if(flag==1)
        System.out.println("GIVEN NUMBER IS PRIME !!");
    else
        System.out.println("NOT PRIME NUMBER !!");

    System.out.println("ENTER THE CHOICE-[1]-Run again  [2]-exit >>");
    ch=sc.nextInt();
    switch(ch)
    {
        case 1:
            prime();
            break;
        case 2:
            System.exit(0);
    }
}
}

