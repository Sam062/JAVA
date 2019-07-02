import java.util.*;
public class StringBuilderTest
{
    public static void main(String args[])
    {
        StringBuilder x=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String :");
        String s=sc.nextLine();
        x.append(s);
        System.out.println("X.APPEND="+x);
        x.reverse();
        System.out.println("X.REVERSE="+x);
    }
}
