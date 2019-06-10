// A program to solve the Sock Merchant's Pairs problem.

import java.util.*;
class SockMerchant{
    private int sockPairs(int noOfSocks,int[] arr){
        int noOfPairs=0;
        for(int i=0;i<noOfSocks;i++)
        {
            for(int j=0;j<noOfSocks-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // arr1 contains Frequency of each elements of arr is there.
        int count;
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            count = 0;
            int x = arr[i];
            for (int value : arr) {
                if (x == value) {
                    count++;
                }
                //Frequency of arr elements is stored in arr1.
                arr1[i] = count;
            }
        }

        for(int i=0,j=0;i<arr.length && j<arr.length ;i++,j++)
        {
            //System.out.println(arr[i]+" = "+arr1[i]+" times");
            // after printing arr1[i] and arr[i] i and j variables are skipping the duplicate elements of both the arrays.
            noOfPairs+=(arr1[i]/2);
            //here i,j=0 , below code takes the value of i,j to the next value which is not duplicate.
            // example arr=1,1,2,2,3,3,4 then arr1 will be 2,2,2,2,2,2,1 as their Frequency
            // and i,j below will skip them till the new value of arr comes and duplicate elements are skipped.
            i=i+(arr1[i]-1);
            j=j+(arr1[j]-1);

        }
        return noOfPairs;
    }
    public static void main(String[] args)
    {
        int size;
        int[] arrr;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size :");
        size=sc.nextInt();
        arrr=new int[size];
        System.out.println("enter color of socks : ");
        for(int i=0;i<size;i++)
        {
            arrr[i]=sc.nextInt();
        }
        SockMerchant sm=new SockMerchant();
        System.out.println("No of Pairs="+sm.sockPairs(size,arrr));
    }
}
