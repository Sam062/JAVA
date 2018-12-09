public class OverloadingArithmatic
{
    int add(int a)
    {
        return a+a;
    }
    int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        OverloadingArithmatic obj=new OverloadingArithmatic();
        int x,y;
        x=obj.add(2);
        y=obj.add(5,8);
        System.out.println("x+x="+x+"\nx+y="+y);
    }
}
