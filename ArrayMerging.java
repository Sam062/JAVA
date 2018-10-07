import java.util.*;
public class ArrayMerging {
    private static void read(int arr[], int size) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter elements :");
        for (i = 0; i < size; i++)
            arr[i] = sc.nextInt();
    }
    private static void disp(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print("    " + arr[i]);
    }
    private static void merge(int arr1[], int arr2[], int size1, int size2) {
        int i, j, k;
        int C[] = new int[size1 + size2];
        for(i=0;i<size1;i++)
        {
            for(j=i+1;j<size1;j++)
            {
                int min=i;
                if(arr1[j]<arr1[min])
                    min=j;
                int temp=arr1[i];
                arr1[i]=arr1[min];
                arr1[min]=temp;
            }
        }
        for(i=0;i<size2;i++)
        {
            for(j=i+1;j<size2;j++)
            {
                int min=i;
                if(arr2[j]<arr2[min])
                    min=j;
                int temp=arr2[i];
                arr2[i]=arr2[min];
                arr2[min]=temp;
            }
        }
        i =0;j =0; k = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                C[k] = arr1[i];
                i++;
                k++;
            }
            else if (arr1[i] > arr2[j]) {
                C[k] = arr2[j];
                j++;
                k++;
            }
            else if (arr1[i] == arr2[j]) {
                C[k] = arr1[i];
                i++;
                j++;
                k++;
            }
        }
        if (i < size1 && j ==size2) {
            while (i < size1) {
                if(C[k-1]!=arr1[i])
                {
                    C[k] = arr1[i];
                    i++;
                    k++;
                }
                else
                    i++;
            }
        }
        else if (i ==size1 && j < size2) {
            while (j < size2) {
                if(C[k-1]!=arr2[j])
                {
                    C[k] = arr2[j];
                    j++;
                    k++;
                }
                else
                    j++;
            }
        }
        System.out.println("\nMerged Array :");
        disp(C, k);
    }
    public static void main(String args[]) {
        int size1, size2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Array 1 :");
        size1 = sc.nextInt();
        int arr1[] = new int[size1];
        read(arr1, size1);
        System.out.print("Enter Size of the Array 2 :");
        size2 = sc.nextInt();
        int arr2[] = new int[size2];
        read(arr2, size2);
        System.out.print("\nArray 1 is : ");
        disp(arr1, size1);
        System.out.print("\nArray 2 is : ");
        disp(arr2, size2);
        merge(arr1, arr2, size1, size2);
            }
    }
