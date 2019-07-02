class A{
	int x=20;
	void disp() {
		System.out.println("Hi");
	}
}
class B extends A{
	int x=30;
	void show() {
		System.out.println(x);
		System.out.println(super.x);
	}
}
public class SuperDemo extends B {
	int x=40;
	void print()
	{
		System.out.println(super.x);
	}
    public static void main(String[] args){
    	//SuperDemo sd=new SuperDemo();
    	//System.out.println(sd.x);
    	//sd.show();
    	//sd.disp();
    	SuperDemo obj=new SuperDemo();
    	obj.print();
    }
}
