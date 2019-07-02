
class Demo{
	
	//Overridden Method show()
	void show() {
		System.out.println("Demo Class Show method");
	}
	void print() {
		System.out.println("Demo Class print method");
	}
}
public class OverRiding extends Demo{
	
	// overriding method show()
	void show() {
		System.out.println("Overriding Class Show method");
	}
	void display() {
		System.out.println("Display method");
	}
	public static void main(String[] args) {
		OverRiding ob=new OverRiding();
		System.out.println("B class Obj with B reference");
		ob.show();
		ob.print();
		ob.display();
		
		Demo ob1=new OverRiding();
		System.out.println("\n\nB class Obj with A reference");
		ob1.show();
		ob1.print();
		//ob1.display();
		
		/*OverRiding ob2=new Demo();
		System.out.println("\n\nB class Object with A reference");
		ob2.show();
		ob2.print();
		ob2.display();*/   //NOT POSSIBLE
		
		Demo ob4=new Demo();
		System.out.println("\n\nA class Obj with A reference");
		ob4.show();
		ob4.print();
		//ob4.display();
	}
	

}
