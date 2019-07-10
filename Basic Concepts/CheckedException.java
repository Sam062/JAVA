import java.util.*;
class NegativeNumberException extends Exception{
	
}
public class CheckedException {
	void cube(int x) throws NegativeNumberException{
		if(x>0)
			System.out.println(x*x*x);
		else
			throw new NegativeNumberException();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input : ");
		try {
			int a=sc.nextInt();
			CheckedException ce=new CheckedException();
			ce.cube(a);
		}
		catch(NegativeNumberException ne) {
			System.err.println(ne);
		}
	}
		

}
