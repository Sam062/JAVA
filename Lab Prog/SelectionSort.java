import java.util.*;
public class SelectionSort
{
    public static void main(String args[])
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array :");
        size=sc.nextInt();
        int arr[]=new int[size];
        read(size, arr);
        System.out.println("\nElements are :");
        print(size, arr);
        Sort(size,arr);
    }

    private static void read(int size,int arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements :");
        for(int i=0; i<size; i++)
            arr[i]=sc.nextInt();
    }
    private static void print(int size, int arr[])
    {
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+" ");
    }
    private static void Sort(int size, int arr[])
    {
        int i,j,min;
        for(i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            {
                min=i;
                if(arr[j]<arr[min])
                    min=j;
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        System.out.println("\nSorted Array :");
        print(size,arr);
    }
}
