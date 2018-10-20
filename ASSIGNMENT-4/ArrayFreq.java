import java.util.*;
public class ArrayFreq
{
    public static void main(String args[])
    {
        int size,i,j,count;
        System.out.println("enter size :");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements :");
        for(i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Given Array is  :     ");
        for(i=0;i<size;i++)
        {
            System.out.print(" "+arr[i]);
        }
        int B[]=new int[size];
        for(i=0;i<size;i++)
        {
            count=0;
            for(j=0;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    B[i]=count;
                }
            }
        }
        System.out.println("\nFrequency of elements : \n");
        for(i=0;i<size;i++)
        {
            System.out.println("Element "+arr[i]+" - "+B[i]+" times.");
        }
    }
}
