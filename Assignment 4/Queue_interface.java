import java.util.*;
import java.io.*;
interface Queue
{
    public void insert(int n);
    void delete();
    void display();
}
class Queue_interface implements Queue
{
    int front=-1,rear=-1;
    int size=5;
    int[] num = new int[size];
    public void insert(int n)
        {
            if(rear==size-1)
            {
                System.out.println("Queue is full cannont insert");
            }
            else
            {
                if(rear==-1 && front==-1)
            {
                front=0;
            }
                rear=rear+1;
                num[rear]=n;
                System.out.println("Number "+n+" inserted in the Queue");
            }
        }
        public void delete()
        {
            if(rear==-1 && front==-1)
            {
                System.out.println("Queue is Empty");
            }
            else
            {
                if(front>=rear)
                {
                    front=-1;
                    rear=-1;
                }
                else
                {
                front++;
                }
            }
        }
        public void display()
        {
            if(front==-1 && rear==-1)
            {
                System.out.println("Queue is empty");
            }
            else
            {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(num[i]);
            }
        }
        }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        Queue_interface obj=new Queue_interface();
        int option=0;
        while(option!=4)
        {
        System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
        option=input.nextInt();
        switch(option)
        {
            case 1:System.out.println("Enter the number to insert");
            int n=input.nextInt();
            obj.insert(n);
            break;
            case 2:obj.delete();
            break;
            case 3:obj.display();
            break;
            case 4:System.exit(0);
            break;
            default:System.out.println("Invalid Option");
            break;            
        }
    }
        input.close();
    }
}