import java.util.*;
public class QuickSort
{
    private void read(int size, int arr[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements :");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
    }
    private void disp(int size, int arr[])
    {
        for(int i=0;i<size;i++)
            System.out.print(" "+arr[i]);
    }
    private void quick(int arr[], int first, int last)
    {
        int start,end,pivot,temp;
        if(first<last)
        {
            pivot=first;
            start=first;
            end=last;
            while(start<end)
            {
                if(arr[start]<=arr[pivot] && start<last)
                    start++;
                while(arr[end]>arr[pivot])
                    end--;
                if(start<end)
                {
                    temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                }
            }
            temp=arr[pivot];
            arr[pivot]=arr[end];
            arr[end]=temp;
            quick(arr,first,end-1);
            quick(arr,end+1,last);
        }

    }
    public static void main(String args[])
    {
        QuickSort A=new QuickSort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        A.read(size,arr);
        System.out.print("\nArray Elements :  ");
        A.disp(size,arr);
        A.quick(arr,0,size-1);
        System.out.print("\nSorted Array :  ");
        A.disp(size,arr);
    }
}
