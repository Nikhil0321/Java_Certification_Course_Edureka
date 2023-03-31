public class Threadtable extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        System.out.println("5 x "+i+" = "+i*5);
    }
    public static void main(String args[])
    {
        Threadtable c=new Threadtable();
        Thread t1=new Thread(c);
        t1.start();
        for(int i=2;i<=40;i=i+2)
        {
            System.out.print(i+"\t");
        } 
    }
}
