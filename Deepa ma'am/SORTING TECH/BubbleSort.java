
			// BUBBLE SORT

import java.util.Scanner;
class BubbleSort
{
	public static void main(String args[])
	{
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the ARRAY");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of the ARRAY");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("GIVEN ARRAY :");
		for(i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
		for(i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("\nSORTED ARRAY :");
		for(i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}