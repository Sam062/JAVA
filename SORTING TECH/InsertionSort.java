	import java.util.*;
public class InsertionSort
{

    public static void main(String args[])
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array :");
        size=sc.nextInt();
        int arr[]=new int[size];
        read(size, arr);
        print(size, arr);
        Sort(size,arr);
    }

    private static void read(int size,int arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements :");
        for(int i=0; i<size; i++)
            arr[i]=sc.nextInt();
    }
    private static  void print(int size, int arr[])
    {
        System.out.println("\nElements :");
        for(int i=0; i<size; i++)
            System.out.print(arr[i]+" ");
    }
    private static  void Sort(int size, int arr[])
    {
        int temp,k;
        for(int i=1;i<size;i++)
        {
            temp=arr[i];
            k=i-1;
            while(k>=0 && arr[k]>temp)
            {
                arr[k+1]=arr[k];
                k=k-1;
            }
         arr[k+1]=temp;
        }
        print(size,arr);
    }


}
