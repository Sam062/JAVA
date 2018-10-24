public class EncodeLabTest
{
    public static void main(String args[])
    {
        int a=1234569;
        int b=a;
        System.out.println("value ="+a);
        int rem,value=0;
        while(b>0)
        {
            rem=b%10;
            value=value*10+rem;
            b=b/10;
        }
        b=value;
        StringBuilder S= new StringBuilder();
        while(b>0)
        {
            rem=b%10;
            if(rem==9)
            {
                rem=0;
                S.append(rem);
            }
            else
            {
                rem++;
                S.append(rem);
            }
            b=b/10;
        }
        System.out.println("Encoded="+S);

    }
}
