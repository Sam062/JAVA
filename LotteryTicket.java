<<<<<<< HEAD
                    // Lottery Winner Count

import java.util.*;

public class LotteryTicket {
    private int n,count;
    int[] arr;
    public static void main(String[] args)
    {
        LotteryTicket ob=new LotteryTicket();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Tickets=");
        ob.n=sc.nextInt();

        // Storing ticket numbers in ob.arr
        ob.arr=new int[ob.n];
        for(int i=0;i<ob.n;i++)
            ob.arr[i]=i+1;

        //finding the Digits_sum to create coupon_Sum
        int[] arr1=new int[ob.n];
        for(int i=0;i<ob.n;i++)
        {
            int size=ob.arr[i];
            int sum=0,rem;
            while(size>0)
            {
                rem=size%10;
                sum=sum+rem;
                size=size/10;
            }
            arr1[i]=sum;
        }
        //System.out.println("\nCoupon_Sum :");

        // getting max value To Analyse
        int max=0;
        for(int x:arr1) {
            if(x>max)
            {
                max=x;
            }
           // System.out.print(x+" ");
        }
        System.out.println();
        // from the max value create a count array which contains number of counts
        int[] countArr=new int[max];
        for(int i=1;i<=max;i++)
        {
            ob.count=0;
            for(int j=0;j<ob.n;j++)
            {
                if(arr1[j]==i)
                    ob.count++;
            }
            countArr[i-1]=ob.count;
        }
        //System.out.println("countArray =");

        //from the count array finding the max number
        max=0;
        for(int x:countArr)
        {
            if(x>max)
            {
                max=x;
            }
           // System.out.println(x);
        }
        ob.count=0;
        for(int x:countArr)
        {
            if(x==max)
                ob.count++;
        }
        System.out.println("OUTPUT="+ob.count);

    }


}
=======
                    // Lottery Winner Count

import java.util.*;

public class LotteryTicket {
    private int n,count;
    int[] arr;
    public static void main(String[] args)
    {
        LotteryTicket ob=new LotteryTicket();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of Tickets=");
        ob.n=sc.nextInt();

        // Storing ticket numbers in ob.arr
        ob.arr=new int[ob.n];
        for(int i=0;i<ob.n;i++)
            ob.arr[i]=i+1;

        //finding the Digits_sum to create coupon_Sum
        int[] arr1=new int[ob.n];
        for(int i=0;i<ob.n;i++)
        {
            int size=ob.arr[i];
            int sum=0,rem;
            while(size>0)
            {
                rem=size%10;
                sum=sum+rem;
                size=size/10;
            }
            arr1[i]=sum;
        }
        //System.out.println("\nCoupon_Sum :");
        int max=0;
        for(int x:arr1) {
            if(x>max)
            {
                max=x;
            }
           // System.out.print(x+" ");
        }
        System.out.println();

        // getting max value To Analyse
        int[] countArr=new int[max];
        for(int i=1;i<=max;i++)
        {
            ob.count=0;
            for(int j=0;j<ob.n;j++)
            {
                if(arr1[j]==i)
                    ob.count++;
            }
            countArr[i-1]=ob.count;
        }
        //System.out.println("countArray =");
        max=0;
        for(int x:countArr)
        {
            if(x>max)
            {
                max=x;
            }
           // System.out.println(x);
        }
        ob.count=0;
        for(int x:countArr)
        {
            if(x==max)
                ob.count++;
        }
        System.out.println("OUTPUT="+ob.count);

    }


}
>>>>>>> ff77f7e4606f8a1ee324315df74de622736d656e
