// program showing the use of super keyword in inheritance

class Box
{
double width,height,depth;
Box(Box ob)
{
width=ob.width;
height=ob.height;
depth=ob.depth;
}
Box(double w, double h,double d)
{
width=w;
height=h;
depth=d;
}
Box()
{
width=-1;
height=-1;
depth=-1;
}
double volume()
{
return width*height*depth;
}
}
class Boxweight extends Box
{
double weight;
	Boxweight(Boxweight ob)
	{
	super(ob);
	weight=ob.weight;
	}
Boxweight(double w,double h,double d, double m)
{
super(w,h,d);
weight=m;
}
}
class SupKeydDemo
{
public static void main(String args[])
{
Boxweight mybox1= new Boxweight(10,20,15,34.3);
Boxweight mybox2=new Boxweight(2,3,4,0.076);
Boxweight myclone=new Boxweight(mybox1);
double vol;
vol=mybox1.volume();
System.out.println("volume of mybox1 is : "+vol);
System.out.println("weight of mybox1 is : "+mybox1.weight);
vol=mybox2.volume();
System.out.println("volume of mybox2 is : "+vol);
System.out.println("weight of mybox2 is : "+mybox2.weight);
vol=myclone.volume();
System.out.println("volume of myclone is : "+vol);
System.out.println("weight of myclone is : "+myclone.weight);
}
}
