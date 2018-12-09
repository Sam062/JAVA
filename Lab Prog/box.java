class box
{
	private int l, b, h;
	public box()
	{
		l=10;
		b=8;
		h=4;
	}
	public static void main(String args[])
	{
		box b1=new box();
		box b2=b1;
		b1.l=100;
		b1.b=50;
		b1.h=5;
		
		System.out.println("BOX B1-l="+b1.l+" b="+b1.b+" h="+b1.h);
		System.out.println("BOX B2-l="+b2.l+" b="+b2.b+" h="+b2.h);
	}
}