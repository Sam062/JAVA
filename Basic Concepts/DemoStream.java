// this is the example how System.out.println() works

class PrintStream
{
	void printLn() {
		System.out.println("called from DemoStream/System class");		
	}	
}

public class DemoStream //DemoStream can be Replaced as System for understanding purpose
{ 
	public final static PrintStream out=new PrintStream();
	public final static PrintStream err=new PrintStream();
	
	public static void main(String[] args) {
		
		DemoStream.out.printLn(); 	//works same as System.out.println(); 
		DemoStream.err.printLn();

	}
	

}
