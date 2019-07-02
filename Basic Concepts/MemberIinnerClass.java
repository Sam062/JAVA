class Outer{
	int x=500;
	class Inner{
		int x=100;
		void show() {
			System.out.println("welcome "+x);
		}
	}
}
public class MemberIinnerClass {
	public static void main(String[] args) {
		Outer out=new Outer();
		Outer.Inner in=out.new Inner();
		in.show();
		System.out.println(in.x+100);
		System.out.println(out.x);
	}
	
}
