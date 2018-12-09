//program to demonstrate the concept of nested class and inner class with loop
class Outer
{
int outer_x=100;
void test()
{
	 for(int i=0;i<5;i++)
      {
Inner inner=new Inner();
inner.display();
	  }
}
class Inner
{
void display()
{
System.out.println("display:outer_x="+outer_x);
}
}
}
public class Innerclassdemowithinloop
{
public static void main(String args[])
{
Outer outer=new Outer();
outer.test();
}
}

