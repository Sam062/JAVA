import java.util.*;
public class StringPalindrome
{
    public static void main(String args[])
    {
        String s,x="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Input String :");
        s=sc.nextLine();
        int length=s.length();
        System.out.println("String is :  "+s+"   and its length is :  "+length);
        int flag=0;
        for(int i=2;i<=Math.sqrt(length);i++)   //checking length is prime or not
        {
            if(length%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Length of string is Prime !!");
        else
            System.out.println("Length of string is Not Prime !!");

        for(int i=length-1; i>=0; i--)      //checking string is palindrome ?? or not
        {
            x+=s.charAt(i);
        }
        if(s.equals(x))
            System.out.println("String is Palindrome :  "+x);
        else
            System.out.println("String is not Palindrome :  "+x);
    }
}
