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
        System.out.println();
        for(i=0;i<size;i++)
        {
            count=0;
            int x=arr[i];
            for(j=0;j<size;j++)
            {
                if(x==arr[j])
                {
                    count++;
                }
            }
            System.out.println("Element "+x+" - "+count+" times.");
        }
    }
}
