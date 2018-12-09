class A{
    int i,j;
    void showij()
    {
        System.out.println("i and j :"+i+" "+j);
    }
}
class B extends A{
    int k;
    void showk()
    {
        System.out.println("k="+k);
    }
    void sum()
    {
        System.out.println("i+j+k="+(i+j+k));
    }
}
public class Inharitance
{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();
        a.i=10;
        a.j=20;
        System.out.println("Content of A :");
        a.showij();
        b.i=7;
        b.j=8;
        b.k=9;
        System.out.println("Content of B :");
        b.showij();
        b.showk();
        System.out.println("Sum of i,j,k :");
        b.sum();
    }
}
