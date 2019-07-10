import java.io.*;
public class CopyDemo {
	public static void main(String[] args) {
		String s1="Switch1.java";
		String s2="abc.txt";
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fis=new FileInputStream(s1);
			fos=new FileOutputStream(s2);
			int size=fis.available();
			byte[] a=new byte[size];
			fis.read(a);
			fos.write(a);			
		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally {
			try {
				fis.close();
				fos.close();
			}
			catch(Exception e) {
				System.err.println(e);
			}
		}
		
		
	}

}
