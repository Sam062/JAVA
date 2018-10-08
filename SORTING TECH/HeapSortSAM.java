
				// HEAP SORT


import java.util.Scanner;
public class HeapSortSAM
{
        public static void main(String args[])
        {
            int size;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Size of the ARRAY >>");
            size=sc.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter the ARRAY elements >>");
            for(int i=0;i<size;i++)
                arr[i]=sc.nextInt();
            System.out.print("THE GIVEN ARRAY IS :");
            System.out.println();
            for(int i=0;i<size;i++)
                System.out.print("  "+arr[i]);
			
			// creating max HEAP
            for(int i=size/2-1;i>=0;i--)
            {
                heapify(arr, size, i);
            }
			System.out.print("\nTRY ARRAY IS :");
            System.out.println();
            for(int i=0;i<size;i++)
                System.out.print("  "+arr[i]);
			
			// HEAPIFYING the TREE
            for(int i=size-1;i>=0;i--)
            {
                int temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;

                heapify(arr, i, 0);
            }
            System.out.print("\nHEAPIFIED ARRAY IS (USING MAX HEAP) :");
            System.out.println();
            for(int i=0;i<size;++i)
                System.out.print("  "+arr[i]);
        }
        private static void heapify(int arr[], int size, int i)
        {
            int largest=i;
            int left=2*i+1;
            int right=left+1;
            if(left<size && arr[left]>arr[largest])
                largest=left;
            if(right<size && arr[right]>arr[largest])
                largest=right;
            if(largest !=i)
            {
                int swap=arr[i];
                arr[i]=arr[largest];
                arr[largest]=swap;

                //recursively call
                heapify(arr, size, largest);
            }
        }
}
