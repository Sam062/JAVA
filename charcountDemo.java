package com.app;
import java.util.*;

public class charcountDemo {
	public static void main(String[] args) {
		String s="";
		Scanner sc=new Scanner(System.in);
		System.out.println("input String :");
		s=sc.nextLine();
		char[] a=s.toCharArray();
		
		Arrays.sort(a);
		int[] arr=new int[a.length];
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			count=0;
			char x=a[i];
			for (int j = 0; j < a.length; j++) {
				if(x==a[j])
					count++;
				arr[i]=count;
			}
		}
		for(int i=0,j=0;i<a.length && j<a.length ;i++,j++)
        {
			if(a[i]==' ') {
				System.out.println("space = "+arr[i]);
			}
			else {
				System.out.println(a[i]+" = "+arr[i]);
	            i=i+(arr[i]-1);
	            j=j+(arr[j]-1);
			}
        }
		int max=0;
		for(int i=0;i<a.length;i++) {
			max=0;
			for(int j=0;j<a.length;j++) {
				if(max<arr[j])
					max=arr[j];
			}
		}
		int max1=0;
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i]) {
				max1=i;
				break;
			}
		}
		System.out.println("Max time character="+a[max1]);
		sc.close();
	}
}
