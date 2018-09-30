import java.util.*;
class OrderStat
{
    public static void main(String args[])
    {
        int i,size,min,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size :");
        size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Input Array Elements :");
        for(i=0; i<size; i++)
            arr[i]=sc.nextInt();
        System.out.println("Array Elements :");
        for(i=0; i<size; i++)
            System.out.print(arr[i]+" ");
        if(size%2==0)
        {
            System.out.println("\nImplementing Even Case :");
            if(arr[0]<arr[1])
            {
                min=arr[0];
                max=arr[1];
            }
            else
            {
                min=arr[1];
                max=arr[0];
            }
            for(i=2; i<size; i++)
            {
                if(i%2==0)
                {
                    if(arr[i]<=arr[i+1] && arr[i]<=min)
                        min=arr[i];
                    else if(arr[i+1]<=arr[i] && arr[i+1]<=min)
                        min=arr[i+1];
                    if(arr[i]>=arr[i+1] && arr[i]>=max)
                        max=arr[i];
                    else if(arr[i+1]>=arr[i] && arr[i+1]>=max)
                        max=arr[i+1];
                }
            }
            System.out.println("\nMin="+min+"\nMax ="+max);
        }
        else
         {
            System.out.println("\nImplementing Odd Case :");
                 min=arr[0];
                 max=arr[0];
             for(i=1; i<size; i++)
             {
                 if(i%2!=0)
                 {
                     if(arr[i]<=arr[i+1] && arr[i]<=min)
                         min=arr[i];
                     else if(arr[i+1]<=arr[i] && arr[i+1]<=min)
                         min=arr[i+1];
                     if(arr[i]>=arr[i+1] && arr[i]>=max)
                         max=arr[i];
                     else if(arr[i+1]>=arr[i] && arr[i+1]>=max)
                         max=arr[i+1];
                 }
             }
             System.out.println("\nMin="+min+"\nMax ="+max);
        }
    }
}