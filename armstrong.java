// ARMSTRONG NUMBERS

// package com.jetbrains;
import java.util.Scanner;
import static javafx.application.Platform.exit;

class armstrong
{
    public static void main(String args[])
    {
        Armstrong();
    }
        private static void Armstrong()
        {
            int num, rem, sum=0, temp,ch;
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the number :>>");
            num=sc.nextInt();
            temp=num;
            while(temp>0)
            {
                rem=temp%10;
                sum=sum+(rem*rem*rem);
                temp=temp/10;
            }
            if(num==sum)
                System.out.println("ARMSTRONG NUMBER !!");
            else
                System.out.println("NOT ARMSTRONG !!");
            System.out.println("PRESS :- [1]-Check for Another number. [2]-Exit.");
            ch=sc.nextInt();
            if(ch==1)
                Armstrong();
            else
                exit();
        }
}
