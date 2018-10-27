import java.util.*;
public class SortMerge
{
    private static int i;
    private static void disp(int arr[])
    {
        System.out.println();
        for(i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
    }
    // Merges two sub arrays of arr[].
    // First sub array is arr[start..mid]
    // Second sub array is arr[mid+1..end]
    private static void merge(int arr[],int start,int mid,int end)
    {
        // Find sizes of two sub arrays to be merged
        int size1,size2;
        size1=mid-start+1;
        size2=end-mid;

        int A[]=new int[size1];
        int B[]=new int[size2];
        /*Copy data to temp arrays*/
        for(i=0;i<size1;i++)
            A[i]=arr[start+i];
        for(i=0;i<size2;i++)
            B[i]=arr[mid+1+i];

        /* Merge the temp arrays */

        // Initial indexes of first and second sub arrays
        int i=0,j=0,k=start;

        while(i<size1 && j<size2)
        {
            if(A[i]<=B[j])
            {
                arr[k]=A[i];
                i++;
            }
            else
            {
                arr[k]=B[j];
                j++;
            }
            k++;
        }
        while(i<size1)
        {
            arr[k]=A[i];
            i++;
            k++;
        }
        while(j<size2)
        {
            arr[k]=B[j];
            j++;
            k++;
        }
    }
    // Main function that sorts arr[l..r] using
    // merge()
    private static void sort(int arr[],int start,int end)
    {
        if(start<end)
        {
            // Find the middle point
            int mid=(start+end)/2;
            // Sort first and second halves
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            // Merge the sorted halves
            merge(arr,start,mid,end);
        }
    }
    public static void main(String args[])
    {
        int size;
        System.out.println("Enter size :");
        Scanner sc=new Scanner(System.in);
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements :");
        for(i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.print("Input Array :");
        disp(arr);
        sort(arr,0,arr.length-1);
        System.out.println("\nSorted Array is :");
        disp(arr);
    }
}
