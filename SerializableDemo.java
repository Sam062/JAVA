import java.io.*;
class Emp implements Serializable{
  int EmpNo=11;
  double salary=5000.0;
}
public class SerializableDemo{
  public static void main(String[] args){
    try{
      Emp e1=new Emp();
      FileOutputStream fs=new FileOutputStream("abc.txt");  //opening file abc as write mode
      ObjectOutputStream oos=new ObjectOutputStream(fs); //writting object in that file
      oos.writeObject(e1);
      oos.close();
      fs.close();

      FileInputStream fis=new FileInputStream("abc.txt"); //opening file abc as read mode
      ObjectInputStream ois=new ObjectInputStream(fis);//reading object from the file
      Emp e2=(Emp)ois.readObject();// this method returns object type which is  DOWNCASTED to e2
      System.out.println(e2.EmpNo+"\t"+e2.salary);
      ois.close();
      fis.close();

// copying e2 obj to a file
    FileOutputStream fos=new FileOutputStream("xyz.txt");
    ObjectOutputStream oos1=new ObjectOutputStream(fos);
      oos1.writeObject(e2);
      oos1.close();
        fos.close();
    }
    catch(Exception e){
      System.err.println(e);
    }
  }
}
