abstract class Test{
	static int x=100;
	abstract void show();
	abstract void print();
	void disp() {
		System.out.println("Display method "+x);
	}
}
public class AbstractClassDemo extends Test{
	int x=500;
	void show() {
		int y=100;
		System.out.println("show method "+(Test.x+y));
	}
	void print() {
		int y=200;
		System.out.println("print method "+(x+y));		
	}
	public static void main(String[] args) {
		AbstractClassDemo acd=new AbstractClassDemo();
		acd.show();
		acd.print();
		acd.disp();
	}

}
