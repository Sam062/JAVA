
class th1 extends Thread
{
    int i;
    public void run()
    {
        for(i=0;i<=15;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}

class Threading
{
    public static void main(String args[])
    {
        th1 ob=new th1();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob);
                t1.setPriority(10);
        t1.setName("th - 1 = ");
                t2.setPriority(1);
        t2.setName("th - 2 = ");
        t1.start();
        t2.start();
    }
}