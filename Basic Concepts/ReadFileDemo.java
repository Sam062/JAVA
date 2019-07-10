import java.io.*;
public class ReadFileDemo {
	public static void main(String[] args) {
		FileInputStream fs=null;
		try 
		{
			String s1="Switch1.java";
			fs=new FileInputStream(s1);
			int size=fs.available();
			byte[] b=new byte[size];
			fs.read(b);
			String s2=new String(b);
			System.out.println(s2);
			
		}
		catch(Exception e) {
			System.err.println(e);			
		}
		finally {
			try {
				fs.close();
			}
			catch(Exception e) {
				System.err.println(e);
			}
		}
	}

}
