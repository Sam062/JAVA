class Display
{
	public static void main(String args[])
	{
		for(int i=1; i<=5;i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j);
			for(int k=i;k<=5;k++)
				System.out.print(" ");
			for(int j=1; j<=i; j++)
				System.out.print(i);
		System.out.println();
		}
	}
}