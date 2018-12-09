import java.io.IOException;
import java.util.*;
public class MultipleCatchBlock
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Input a :");
            int a=sc.nextInt();
            System.out.println("Input b :");
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        /*catch(IOException e1)
        {
            System.out.println(e1);
        }*/
        catch(NumberFormatException e3)
        {
            System.out.println(e3);
        }
        System.out.println("HELLO !");

    }
}
