package ClearScreen;

public class clear {
    void metho()
    {
        System.out.println("Clear Screen Test");
        for(int i=0;i<50;i++)
            System.out.println();
    }
    public static void main(String[] args)
    {
        clear clr=new clear();
        clr.metho();
    }
}

