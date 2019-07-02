
class StringOperations {
	public static void main(String[] args) {
		String s=new String();
		s="String Example";
		System.out.println(s);
		
		System.out.println(s.toUpperCase());
		
		char[] example;
		example=s.toCharArray();
		
		System.out.println(s.toLowerCase());
		int count=0;
		for(int i=0;i<example.length;i++) {
			System.out.print(example[i]+" ");
			count++;
		}
		System.out.println("\nString length="+count);
		System.out.println();
		
		//is.equals
		String x=new String("String Example");
		
		System.out.println(s==x);// compares hash code whereas equals() compares hash code first then compares char by chars
		System.out.println(s.equals(x));		
		
		
	}

}
