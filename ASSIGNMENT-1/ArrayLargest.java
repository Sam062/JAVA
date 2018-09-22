import java.util.Scanner;
class ArrayLargest
{
	public static void main(String args[])
	{
		int size,i,small=0,large=0;
		int arr[]=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of The ARRAY :");
		size=sc.nextInt();
		System.out.print("Enter Elements of The ARRAY :");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("THE ARRAY IS :: ");
		small=arr[0];
		large=arr[0];
		for(i=0;i<size;i++)
		{
			if(small>arr[i])
				small=arr[i];
			if(large<arr[i])
				large=arr[i];
			System.out.print(" "+arr[i]);
		}
		System.out.print("\nSmallest in the array ="+small);
		System.out.print("\nLargest in the array ="+large);
	}
}