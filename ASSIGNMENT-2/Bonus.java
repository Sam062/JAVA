import java.util.*;

class Bonus
{
	public static void main(String args[])
	{
		int income,emp,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter income :");
		income=sc.nextInt();
		System.out.println("enter Emp code b/w [1]-[4] :");
		emp=sc.nextInt();
		if(emp>4 || emp<1)
			System.out.println("Plz enter employee b/w 1-4 :");
		else
		{
			switch(emp)
			{
				case 1:
				result=(income*5)/100;
				System.out.println("employee code 100 gets "+result+"rs Bonus.");
				break;
			case 2:
				result=(income*1)/100;
				System.out.println("employee code 200 gets "+result+"rs Bonus.");
				break;
			case 3:
				result=(income*2)/100;
				System.out.println("employee code 300 gets "+result+"rs Bonus.");
				break;
			case 4:
				result=(income*25)/100;
				System.out.println("employee code 400 gets "+result+"rs Bonus.");
				break;
			}
		}
	}
}