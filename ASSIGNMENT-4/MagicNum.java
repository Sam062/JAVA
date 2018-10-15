import java.util.*;
public class MagicNum
{
    public static void main(String args[])
    {
        int num,rem,value=0,value1=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Num :");
        num=sc.nextInt();
        int temp=num;
        while(temp>0) {
            rem = temp % 10;
            value += rem;
            temp = temp / 10;
        }
        temp=value;
        while(temp>0) {
            rem=temp%10;
            value1+=rem;
            temp=temp/10;
        }
        if(value1==1)
            System.out.print("\n"+num+" is a  Magic Number !!");
        else
            System.out.print("\n"+num+" is Not A Magic Number !!");
    }
}
