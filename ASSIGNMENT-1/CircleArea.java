import java.util.Scanner;
public class CircleArea
{
    public static void main(String args[])
    {
		area();
    }
    private static void area()
    {
        int radius;
        double pi=3.14159,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius >> ");
        radius=sc.nextInt();
        System.out.println("(Area of Circle=pi * r * r)");
        result=pi*radius*radius;
        System.out.println("Area of Circle="+result);
    }
}
