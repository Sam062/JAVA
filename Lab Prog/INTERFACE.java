interface in{
    void f1(int a,int b);
    int a=100;
}
interface inn {
    void f2();
    int b=500;
}
public class INTERFACE implements in,inn{
    @Override
    public void f1(int a, int b)
    {
        System.out.println("f1="+(a+b));
    }
    @Override
    public void f2()
    {
        System.out.println("f2");
    }
    public static void main(String[] args)
    {
        INTERFACE ob=new INTERFACE();
        ob.f1(a,b);
        ob.f2();
        System.out.println(a+" : "+b);
    }

}
