import java.util.*;
public class ArrayOperations
{
    private static int size,size1;
    private static int arr[];
    private ArrayOperations(int sz)
    {
        size=sz;
        size1=sz;
        arr=new int[size];
        read();
    }
    private void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements :");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
    }
    private void disp()
    {
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }
    private void delete(int pos)
    {
        if(pos>size || pos<1)
            System.out.println("Invalid Position !! ");
        else if(pos==size)
            size--;
        else if(pos==1)
        {
            for(int i=0;i<size-1;i++)
                arr[i]=arr[i+1];
            size--;
        }
        else
        {
            for(int i=pos-1;i<size-1;i++)
                arr[i]=arr[i+1];
            size--;
        }
    }
    private void insert(int pos,int elt)
    {
        if(pos>size+1 || pos<1)
            System.out.println("Invalid Position");
        else if(pos==size)
        {
            size++;
            arr[pos]=elt;
        }
        else
        {
            size++;
            for(int i=size-1;i>=pos;i--)
                arr[i]=arr[i-1];
            arr[pos-1]=elt;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size :");
        size=sc.nextInt();
        ArrayOperations A=new ArrayOperations(size);
        int pos;
        while(true)
        {
            int ch;
            System.out.println("\nEnter Choice : [1]-Insert [2]-Delete [3]-Display [4]-Exit : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    if(size>=size1)
                    System.out.println("\nARRAY FULL !!");
                    else
                    {
                        System.out.println("Position to Insert :");
                        pos=sc.nextInt();
                        System.out.println("Element to insert :");
                        int elt=sc.nextInt();
                        A.insert(pos,elt);
                    }
                    break;
                case 2:
                    if(size<=0)
                        System.out.println("\nEMPTY ARRAY !!");
                    else
                    {
                    System.out.println("Position to delete :");
                    pos=sc.nextInt();
                    A.delete(pos);
                }
                    break;
                case 3:
                    System.out.println("Array is :");
                    A.disp();
                    break;
                case 4:
                    System.exit(0);
                default :
                    System.out.println("Invalid choice !!");
            }
        }

    }
}
