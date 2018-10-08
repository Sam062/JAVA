package com.jetbrains;
import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character :");
        char c=sc.next().charAt(0);
        System.out.println("the char is :"+c);

        System.out.println("SIMPLE CALCULATOR");
        choi();
    }

    private static void choi ()
    {
        int ch;
        System.out.println("enter ur choice :1-add 2-sub 3-mul 4-div ::");
        Scanner sc=new Scanner(System.in);
        ch=sc.nextInt();
        switch (ch) {
            case 1:
                addition();
                break;
            case 2:
                subtraction();
                break;
            case 3:
                multi();
                break;
            case 4:
                divi();
                break;
            default:
                System.out.println("INVALID CHOICE !!");

        }
    }
    private static void addition()
    {
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        a=sc.nextInt();
        System.out.println("enter b :");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("a+b="+sum);
    }
    private static void subtraction()
    {
        int a,b,sub;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        a=sc.nextInt();
        System.out.println("enter b :");
        b=sc.nextInt();
        sub=a-b;
        System.out.println("a-b="+sub);
    }
    private static void multi()
    {
        int a,b,mul;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        a=sc.nextInt();
        System.out.println("enter b :");
        b=sc.nextInt();
        mul=a*b;
        System.out.println("a*b="+mul);
    }
    private static void divi()
    {
        int a,b,div;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        a=sc.nextInt();
        System.out.println("enter b :");
        b=sc.nextInt();
        div=a/b;
        System.out.println("a/b="+div);
    }
}