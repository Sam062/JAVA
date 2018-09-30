
		// COUNTING SORT

import java.util.Scanner;
public class CountingSort
{
    public static void main(String args[])
    {
        int size, i, largest=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array :>>");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the elements :\n");
        for(i=0; i<size; i++)
            arr[i]=sc.nextInt();

        System.out.print("Given ARRAY :\n");
        for(i=0; i<size; i++)
        {
            if(largest<arr[i])
                largest=arr[i];
            System.out.print(arr[i]+"   " );
        }
        System.out.println("\nLargest Value In Array=" +largest);

        //  INITIALIZE AN ARRAY OF SIZE LARGEST //
        int b_arr[]=new int[largest+1];
            //      initializing zero to the b_arr[]    //
        for(i=0; i<=largest; i++)
            b_arr[i]=0;

        //COUNTING FREQUENCY//
        for(i=0; i<=largest; i++)
        {
            int count=0;
            for(int j=0; j<size; j++)
            {
                if(i==arr[j])
                    count+=1;
                b_arr[i]=count;
            }
        }
        System.out.println("\nFREQUENCY OF Elements :");
        for(i=0; i<=largest; i++)
            System.out.print(b_arr[i]+"  ");

        for(i=1; i<=largest; i++)
            b_arr[i] = b_arr[i] + b_arr[i - 1];

        System.out.println("\nFREQUENCY ADDITION  :");
        for(i=0; i<=largest; i++)
            System.out.print(b_arr[i]+"  ");

        // Creating  C-Array with the help of Array-A and Array-B //
        int c_arr[]=new int[size];
        for(i=size-1; i>=0; i--)
        {
            c_arr[b_arr[arr[i]]-1]=arr[i];
            b_arr[arr[i]]=b_arr[arr[i]]-1;
        }

        System.out.println("\nSORTED ARRAY  :");
        for(i=0; i<size; i++)
            System.out.print(c_arr[i]+"  ");
    }
}