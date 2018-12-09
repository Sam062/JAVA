abstract class dimension
{
    int d1,d2;
    abstract void area();
}
class rectangle extends dimension{

    void area(){
        d1=5;
        d2=10;
        System.out.println("Area of rect ="+(d1 * d2));
    }
}
class triangle extends dimension
{
    void area(){
        d2 = 10;
        d1 = 5;
        System.out.println("Area of triangle ="+(d1 * d2)/2);
    }
}
class AbstractClassDemo{
    public static void main(String args[])
    {
        dimension rect=new rectangle();
        rect.area();
        dimension tri=new triangle();
        tri.area();
    }

}

