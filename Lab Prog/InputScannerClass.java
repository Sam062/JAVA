import java.util.Scanner;
class InputScannerClass
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input String :");
        String s=sc.nextLine();
        System.out.println("String ="+s);
        System.out.println("Input Int :");
        int a=sc.nextInt();
        System.out.println("Int is="+a);
    }
}
