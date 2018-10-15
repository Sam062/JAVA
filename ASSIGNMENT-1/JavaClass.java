class JavaClass  // The java Class should match the file name because it contains the main method
{
	static double pi=3.14; // class variable(it cannot be local)
	public static void main(String args[])  // Main Method which is mendatory to be public
	{
		int a,b,c;  //Local variable
		a=10;
		b=20;
		pi=3.00;
		c=a+b;
		System.out.println("JAVA CLASS EXAMPLE");
		System.out.println("c="+c+"\nThe value of pi in main="+pi);
	}
}


/*
Types of VARIABLE :-
1- LOCAL VARIABLE-
		A variable that is declared inside a method is called LOCAL VARIABLE.

2- INSTANCE VARIABLE :- 
		A variable that is declared inside a class but outside the method is called INSTANCE VARIABLE.
		its not declaed as static.

3- CLASS VARIABLE :-
		A variable that is declared as static is called static (also CLASS)VARIABLE.
		it cannot be local.		
*/