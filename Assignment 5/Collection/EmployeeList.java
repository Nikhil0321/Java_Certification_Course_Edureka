//Write a program to write 5 employee records using HashMap and display them.
import java.util.*;
public class EmployeeList 
{
    public static void main(String args[])
    {
        HashMap<Integer,String> h=new HashMap<Integer,String>();
        h.put(001,"Abhi");
        h.put(002,"Bhavana");
        h.put(003,"Chandru");
        h.put(004,"Deepak");
        h.put(005,"Fakri");
        for(int empid : h.keySet()) 
        {
            String name = h.get(empid);
            System.out.println("Employee ID:"+empid + " Name:"+name);
        }
    }
}
