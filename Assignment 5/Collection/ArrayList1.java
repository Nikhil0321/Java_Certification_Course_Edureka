//Write a program to insert 1 to 10 numbers in ArrayList and display them.
import java.util.*;
class ArrayList1
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<10;i++)
        {
        arr.add(i);
        }
        System.out.println(arr);
    }
}