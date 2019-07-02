class Pattern {
	public static void main(String[] args)
{
		for(int i=10,l=1;(i>=1)||(l<10);i--,l++)
		{
			for(int j=1;j<=((i*2)-1);j++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int k=1;k<=l;k++) {
				System.out.print(" ");
			}
		}
	}
}