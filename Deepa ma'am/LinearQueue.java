import java.util.Scanner;
class LinearQueue
{
    private static void disp(int arr[],int front,int size)
    {
            for(int i=front;i<size;i++)
                System.out.print(" "+arr[i]);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int size = sc.nextInt();
        int arr[]=new int[size];
        int front=-1,rear=-1;
        while(true)
        {
            System.out.println("\nEnter your Choice:[1]-ENQUEUE [2]-DEQUE [3]-DISPLAY [4]-EXIT");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    if(rear==-1)
                    {
                        System.out.println("Enqueue :");
                        front++;
                        rear++;
                        arr[front]=arr[rear]=sc.nextInt();
                        System.out.println("Enqueued- "+arr[rear]+" at index :"+rear);
                    }
                    else if(rear>=size)
                    {
                        System.out.println("Overflow ");
                        --rear;

                    }
                    else
                    {
                        System.out.println("Enqueue :");
                        arr[rear]=sc.nextInt();
                        System.out.println("Enqueued- "+arr[rear]+" at index :"+rear);
                    }
                    rear++;
                    break;
                case 2:
                    if(rear==-1)
                        System.out.println("UnderFlow");
                    else if(front==rear)
                        System.out.println("Queue Cleared");
                    else
                    {
                        System.out.println("Deque Element- "+arr[front]);
                        front++;
                    }
                    break;
                case 3:
                    if((front==-1&&rear==-1)||front==rear)
                        System.out.println("Queue Empty !!");
                    else
                        disp(arr,front,rear);
                    break;
                case 4:
                    System.exit(0);
                default :
                    System.out.println("Enter valid choice !!");
            }
        }
    }
}
