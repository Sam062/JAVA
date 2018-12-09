class multithread {
    public static void main(String args[]) {
        System.out.println("Main Begin");
        System.out.println("Go to other thread");
        first f = new first();
        f.start();
        second s = new second();
        s.start();
        System.out.println("Come Back to main");
        System.out.print("Main end" + " " + f.getName() + " " + s.getName());
    }
}
    class first extends Thread
    {
        public void run()
        {
            for(int i=1;i<=3;i++)
                System.out.println("First i ="+i);
            System.out.println("Over find thread");

        }
    }

    class second extends Thread
    {
        public void run()
        {
            for(int j=1;j<=3;j++)
                System.out.println("Second j=" +j);
            System.out.println("Over Second");
        }

}