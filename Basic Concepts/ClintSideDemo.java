import java.net.*;
import java.io.*;

public class ClintSideDemo {
	public static void main(String[] args) {
		try {
			String address=args[0];
			int port=Integer.parseInt(args[1]);
			Socket s=new Socket(address,port); //Socket Obj
			OutputStream os=s.getOutputStream();// os
			InputStream is=s.getInputStream();//is all these 3 are combinely called Network i/o Streams cuz using socket i/o Stream is created
			byte[] b1=new byte[100];
			byte[] b2=new byte[100];
			while(true) {
				System.out.print("To Server:");
				System.in.read(b1);// Reading input from keyboard in b1
				os.write(b1);// b1 array sending to server using OutputStream

				is.read(b2);// reading data in b2 from server
				String s1=new String(b2);// converting into string
				String s2=s1.trim();
				System.out.println("From Server:"+s2);
			}
		}
		catch(Exception e) {
			System.err.println(e);

		}
	}
}
