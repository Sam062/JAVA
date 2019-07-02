class OuterDemo{
	int x=100;
	static class Inner{
		static int x=200;
		static void show() {
			System.out.println("Welcome "+x);
		}
	}
}
public class StaticMemberClass {
	public static void main(String[] args) {
		OuterDemo od=new OuterDemo();
		OuterDemo.Inner in=new OuterDemo.Inner();
		in.show();
		System.out.println(od.x);
		System.out.println(in.x);
		OuterDemo.Inner.show();
	}
}
