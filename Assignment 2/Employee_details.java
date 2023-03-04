//Write a program to accept 5 employee IDs and the corresponding names 
//and their salaries from the user and store them in three arrays.
//Pass these arrays to a function display() as arguments.
//This display() will display the content of the arrays in thefollowing format.
import java.util.Scanner;
public class Employee_details 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int[] Emp_ID=new int[5];
        String[] Name=new String[5];
        double[] Salary=new double[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter Employee "+(i+1)+" Details");
            System.out.println("Emp ID:");
            Emp_ID[i]=input.nextInt();
            System.out.println("Emp Name:");
            Name[i]=input.next();
            System.out.println("Emp Salary:");
            Salary[i]=input.nextDouble();
        }
        input.close();
        Display(Emp_ID,Name,Salary);
    }
    public static void Display(int[] Emp_ID,String[] Name,double[] Salary)
    {
        System.out.println("Emp_ID\tName\tSalary");
        System.out.println("------------------------");
        for(int i=0;i<Emp_ID.length;i++)
        {
            System.out.print(Emp_ID[i]+"\t");
            System.out.print(Name[i]+"\t");
            System.out.print(Salary[i]+"\n");
        }
    }
}