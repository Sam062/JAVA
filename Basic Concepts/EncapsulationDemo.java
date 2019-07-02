// Binding of variables to methods and those methods operating on same variables.

class One{
	private int value;
	void setValue(int val) {
		this.value=val;
		if(val<0)
			value=0;
		else if(val>100)
			value=100;
		else
			value=val;
	}
	int getValue() {
		return value;
	} 
}
public class EncapsulationDemo extends One {
	public static void main(String[] args) {
		EncapsulationDemo ed=new EncapsulationDemo();
		ed.setValue(50);
		System.out.println(ed.getValue());
	}
}
