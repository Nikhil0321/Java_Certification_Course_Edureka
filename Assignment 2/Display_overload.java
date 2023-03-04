//Write another function display() withEmployee ID array and Employee name array as arguments. 
//(Note: here we are using concept of function overloading). 
//This function will display the content of the 2 arrays in the followingformat
import java.util.Scanner;
public class Display_overload 
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
        Display(Emp_ID,Name);
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
    public static void Display(int[] Emp_ID,String[] Name)
    {
        System.out.println("\nEmp_ID\tName\t");
        System.out.println("-----------------");
        for(int i=0;i<Emp_ID.length;i++)
        {
            System.out.print(Emp_ID[i]+"\t");
            System.out.print(Name[i]+"\n");
        }
    }
}

