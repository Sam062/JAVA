import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferReader
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name :");
        String name=read.readLine();
        System.out.println("Name is :"+name);
    }
}
