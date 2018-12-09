class poly
{
    int x;
    poly(int x1)
    {
        x=x1;
    }
    int multy(int y)
    {
        return x*y;
    }
    float multy(float y)
    {
        return (float)(x*y);
    }
    double multy(double y)
    {
        return (double)(x*y);
    }
}
public class TypeCastingOverloading
{
    public static void main(String args[])
    {
        poly m=new poly(100);
        System.out.println("Integer :"+m.multy(100));
        System.out.println("Float :"+m.multy(2.7f));
        System.out.println("Double :"+m.multy(2.3));
    }
}
