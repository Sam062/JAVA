
            // Krishnamurthy number (2,145 ...)  //
import java.util.*;
public class KrishnamurthyNo
{
    private static int read()
    {
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Number :");
        num=sc.nextInt();
        return num;
    }
    private static int facto(int rem)
    {
        int fact=1;
        while(rem>0)
        {
            fact=fact*rem;
            rem-=1;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int x, rem, total=0;
        int value=read();
        System.out.println("Given Number  is : "+value);
        int temp=value;
        while(temp>0)
        {
            rem=temp%10;
            x=facto(rem);
            total=total+x;
            temp=temp/10;
        }
        System.out.println("Addition of factorials= "+total);
        if(total==value)
            System.out.println("\nKrishnamurthy number !!");
        else
            System.out.println("\nNot Krishnamurthy number");
    }
}
