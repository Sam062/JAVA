class box
{
    double width,height,depth;

}
public class SimpleObject
{
    public static void main(String args[])
    {
        box obj=new box();
        double vol;
        obj.width=10;
        obj.height=20;
        obj.depth=5;
        vol=obj.width*obj.height*obj.depth;
        System.out.println("Volume is :"+vol);
    }
}
