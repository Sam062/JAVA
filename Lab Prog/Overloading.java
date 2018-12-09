class details
{
    void printchar()
    {
        for(int i=0;i<10;i++)
            System.out.print("a");
    }
    void printchar(char c)
    {
        for(int i=0;i<10;i++)
            System.out.print(c);
    }
    void printchar(int k,int c)
    {
        for(int i=0;i<k;i++)
            System.out.print('c');
    }
}
public class Overloading
{
    public static void main(String args[])
    {
        details obj=new details();
        System.out.println("No Arguments :");
        obj.printchar();
        System.out.println("\nSingle Arguments :");
        obj.printchar('b');
        System.out.println("\nMultiple Arguments :");
        obj.printchar(5,'c');
    }
}
