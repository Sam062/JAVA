import java.util.*;
class add{
    void add(int a, int b){
        int c = a+b;
        System.out.println("the sum of two integers is "+c);
    }
    void add(double a, double b){
        double c = a+b;
        System.out.println("the sum of two float is "+c);
    }

}
public class constructorAnchal
{
    public static void main(String args[])
    {
        add obj=new add();
        obj.add(2,5);
        obj.add(2.5,3.2);
    }
}
