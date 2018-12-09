package com.jetbrains;
import java.util.Scanner;

public class pattern2
{
    public static void main(String args[])
    {
        int row, i, j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The No of Rows :>>");
        row=sc.nextInt();
        for(i=1; i<=row; i++)
        {
            for(j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
