interface in1{
    void f1();
}
class InterfaceDemo implements in1{
    public void f1()
    {
        System.out.println("Method ");
    }
    public static void main(String[] args)
    {
        InterfaceDemo ob=new InterfaceDemo();
        ob.f1();
    }
}