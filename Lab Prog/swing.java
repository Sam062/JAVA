import javax.swing.*;
public class swing {
    public static void main(String[] args){
        JFrame f=new JFrame();
        JButton b=new JButton("BUTTON");
        b.setBounds(130,130,100, 50);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}