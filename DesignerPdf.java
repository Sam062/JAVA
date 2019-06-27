import java.util.*;
public class DesignerPdf {
	private String str;	
	
	void setString(String text1) 
	{
		text1=text1.toLowerCase();
		str="";
		String text,demo,fix;
		text=text1;
		if(text.length()<=10) {
			demo=text;
		}
		else {
			demo=text.substring(0,10);			
		}
		fix=demo.trim();
		for(char i:fix.toCharArray())
		{
			if(i==' ')
				break;
			else {
				str+=i;
			}
		}
	}
	
	String getString() {
		return str;
	}
	
	int max(int[] array) {
		int max=0;
		for(int x:array) {
			if(x>max)
				max=x;
		}
		return max;
	}
	void show(int[] array) {
		for(int i:array)
			System.out.print(i+" ");
	}
	
	int designerPdfViewer(int[] heights,String word1) {
		char[] alpha= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] demo=new int[word1.length()];
		int k=0;
		for(char i:word1.toCharArray()) {
			for(int j=0;j<heights.length;j++) {
				if(i==alpha[j])
				{
					demo[k]=heights[j];
					k++;
				}
			}
		}
		System.out.print("\nHeight of Given Characters :> ");
		show(demo);
		System.out.println("\n\n"+max(demo)+"mm height * "+1+"mm width * "+demo.length+" characters");
		int total=max(demo)*1*demo.length;
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input String");
		String word=sc.nextLine();
		int[] arr= new int[26];
		System.out.println("Input Heights of Each character of a-z one by one :>\nlike :> 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 7 :>\n");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		sc.close();
		
		DesignerPdf dp=new DesignerPdf();
		dp.setString(word);
		System.out.println("\n"+dp.getString());
		
		System.out.println("\nResult= "+dp.designerPdfViewer(arr, dp.str)+" mmSquire");
		
		
	}

}
