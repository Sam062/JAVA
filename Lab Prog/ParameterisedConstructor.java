class box
{
    double width,height,depth;
    box(double W,double H,double D)
    {
        width=W;
        height=H;
        depth=D;
    }
    double volume()
    {
        return width*height*depth;
    }
}
public class ParameterisedConstructor
{
    public static void main(String args[])
    {
        box obj=new box(10,15,20);
        box obj1=new box(10,10,10);
        double vol=obj.volume();
        System.out.println("obj volume is :"+vol);
        vol=obj1.volume();
        System.out.println("obj1 volume is :"+vol);
    }
}
