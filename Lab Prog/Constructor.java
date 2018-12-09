class box
{
    double width,height,depth;
    box()
    {
        width=10;
        height=20;
        depth=15;
    }
    double volume()
    {
        return width*height*depth;
    }
}
public class Constructor
{
    public static void main(String args[])
    {
        box obj=new box();
        box obj1=new box();
        double vol;
        vol=obj.volume();
        System.out.println("obj 1 Volume is :"+vol);
        vol=obj.volume();
        System.out.println("obj 2 Volume is :"+vol);
    }
}
