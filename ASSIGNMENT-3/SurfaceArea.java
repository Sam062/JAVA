import java.util.*;
public class SurfaceArea
{
    private static double volumefunc(double w,double h,double d)
    {
        double vol=w*h*d;
        return vol;
    }
    private static double surfArea(double w,double h,double d)
    {
        double SA=2*(w*h+h*d+d*w);
        return SA;
    }

    public static void main(String args[])
    {
        double height,width,depth,volume,surfacear;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter width :");
        width=sc.nextDouble();
        System.out.print("Enter height :");
        height=sc.nextDouble();
        System.out.print("Enter depth :");
        depth=sc.nextDouble();
        System.out.println("\nVolume is :"+volumefunc(width,height,depth));
        System.out.println("Surface area is  :"+surfArea(width,height,depth));
    }
}
