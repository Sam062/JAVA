import java.util.*;
class DivideByZeroException extends Exception{
	
}
public class CheckedException1 {
	void divide(int x,int y) throws DivideByZeroException{
		if(y==0)
			throw new DivideByZeroException();
		else
			System.out.println(x/y);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Input no 1- :");
			int a=sc.nextInt();
			System.out.println("Input no 2- :");
			int b=sc.nextInt();
			CheckedException1 ce=new CheckedException1();
			ce.divide(a, b);
		}
		catch(DivideByZeroException dbze) {
			System.err.println(dbze);			
		}		
	}
}
