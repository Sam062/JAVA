
import java.util.*;
public class DrawingBook {
    private static int turnL,turnR; // turnL is turns from start and turnR is turns from end.
    private int pageCount(int n, int p)
    {
        System.out.println("Total pages="+n+" Page to reach="+p);
        if(n%2!=0)
        {
          if(p==1 || p==n || p==n-1)
          {
              turnL=turnR=0;
          }
          else
              {
              for(int i=2;i<p;i=i+2)
              {
                  turnL++;
              }
              for(int i=n;i>p;i=i-2){
                  turnR++;
              }
          }
        }
        else{
            if(p==1 || p==n)
            {
                turnL=turnR=0;
            }
            else
            {
                for(int i=2;i<=p;i=i+2)
                {
                    turnL++;
                }
                for(int i=n-1;i>p;i=i-2){
                    turnR++;
                }
            }
        }
        System.out.println("Pages to turn from start="+turnL+", and Pages to turn from end="+turnR);
        return (turnR<turnL)?turnR:turnL;
    }

    public static void main(String[] args){
        int no,page,x;
        DrawingBook db=new DrawingBook();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total no of pages :");
        no=sc.nextInt();
        System.out.println("Enter page to find :");
        page=sc.nextInt();
        if(page<=no){
            x=db.pageCount(no,page);
            System.out.println("\nLeast No of Pages to Turn="+x);
        }
        else
            System.out.println("Page to find is out of range");
    }
}
