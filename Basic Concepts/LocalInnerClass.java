
public class LocalInnerClass {
	int x=100;
	public static void main(String[] args) {
		class Demo{
			int x=200;
			void show() {
				System.out.println("Local Inner class "+x);
			}
		}
		Demo d=new Demo();
		d.show();
		LocalInnerClass lic=new LocalInnerClass();
		System.out.println(lic.x);
	}

}
