
import java.util.*;
public class StringCaseConversion {
	String str="";
	void upperToLower(String str1) {
		String lower="";
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]<'a') {
				c[i]+=32;
				lower+=c[i];
			}
		}	
		System.out.println("In lower case=\n"+lower);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringCaseConversion ob=new StringCaseConversion();
		System.out.println("input String in capital case :>");
		ob.str=sc.nextLine();
		sc.close();
		ob.upperToLower(ob.str);
	}

}
