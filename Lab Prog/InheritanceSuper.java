    class ABC{
        int i,j;
        void showij()
        {
            System.out.println("i and j :"+i+" "+j);
        }
    }
    class BCD extends ABC{
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
    public class InheritanceSuper
    {
        public static void main(String args[])
        {
            A superOb=new A();
            B subOb=new B();
            superOb.i=10;
            superOb.j=20;
            System.out.println("Content of SuperClass :");
            superOb.showij();
            subOb.i=7;
            subOb.j=8;
            subOb.k=9;
            System.out.println("Content of SubOb :");
            subOb.showij();
            subOb.showk();
            System.out.println("Sum of i, j, k =");
            subOb.sum();
        }
    }
