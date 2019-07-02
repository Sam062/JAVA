interface f1{
	int x=100; //By default public static final
	void fun1();	// By default abstract
}
interface f2 extends f1{
	int y=x;
	void fun2();	
}
public class InterfaceDemo implements f2 {
	public void fun1(){
		System.out.println("F1 executed and x="+(x+50));
	}
	public void fun2() {
		System.out.println("F2 executed and y="+y);
	}
	public static void main(String[] args) {
		InterfaceDemo id=new InterfaceDemo();
		id.fun1();
		id.fun2();
	}
	
}
