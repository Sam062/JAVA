import java.util.*;
public class DisariumNumber
{
    public static void main(String args[])
    {
        int num,rem,value,pow=0,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num :");
        num=sc.nextInt();
        int a=num;
        while(a>0)
        {
            pow++;
            a=a/10;
        }
        a=num;
        while(a>0)
        {
            int x=pow;
            rem=a%10;
            value=1;
            while(x>0)
            {
                value=value*rem;
                x--;
            }
            sum+=value;
            pow--;
            a=a/10;
        }
        System.out.println("After each digit powered to the position in num="+sum);
        if(sum==num)
            System.out.println("Given Num is DISARIUM ");
        else
            System.out.println("Given Num is Not DISARIUM ");

    }
}
