// program to implement concept of nesed class and inner class 
// and assign value to inner class with the help of constructor.
import java.util.*;
class Outr
{
    int i,x=100;
    void test()
    {
        for(i=0;i<10;i++)
        {
            class inner
            {
               
                inner()
                {
                //  int i;
                }
                void display()
                {
                    System.out.println(+i+" Display x= "+x);
                }
            }
            inner in=new inner();
            in.display();
        }   
    }
}
public class InnerWithConstructor
{
    public static void main(String args[])
    {
        Outr out=new Outr();
        out.test();
    }
    
}
