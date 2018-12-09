package com.jetbrains;
import java.util.Scanner;
public class Pattern1
{
    public static void main(String args[])
    {
        int row, i, j;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NO OF ROWS >>");
        row=sc.nextInt();
        for(i=0; i<row; i++)
        {
            for(j=i; j<row; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
