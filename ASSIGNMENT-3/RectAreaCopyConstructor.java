class box
{
    double l,b;
	box()
	{
		double l=12.5;
		double b=5.5;
		System.out.println("\nDefault constructor-Area of rectancle :"+(l*b));
	}
	box(double L,double B)
	{
		l=L;
		b=B;
		System.out.println("Parameterised constructor-Area of rectancle :"+(l*b));
	}
	box(box a)
	{
		double area=(a.l)*(a.b);
		System.out.println("Copy constructor-Area of rectancle :"+area);
	}
}
public class RectAreaCopyConstructor
{
    public static void main(String args[])
    {
        
		box X=new box();
        box Y=new box(5.5,10.5);
		box Z=new box(Y);
    }
}
