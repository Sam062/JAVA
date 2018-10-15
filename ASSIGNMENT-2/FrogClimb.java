public class FrogClimb
{
    public static void main(String args[])
    {
        int total=0,count=0;
        while(total<=30)
        {
            total+=3;
            count++;
            if(total==30)
                break;
            total -= 2;
        }
        System.out.println("hours to reach Top="+count);
    }
}
