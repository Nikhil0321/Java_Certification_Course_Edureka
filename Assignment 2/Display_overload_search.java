/*Write another function named display() which takes 4 arguments.
The arguments are named as String and 3 arrays (Employee id, name and salary). 
Function prototype looks like:display (String name, int regno[], String Empname[], double salary[]).  
This function will search for the name in the Empname array
and will display its corresponding id and salary in the below given format. 
For example, if Divya is given as the name to search then display () function will
 display the following record.*/
import java.util.Scanner;
public class Display_overload_search 
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
        System.out.println("Enter name to be search");
        String Search_name=input.next();
        input.close();
        Display(Emp_ID,Name,Salary);
        Display(Emp_ID,Name);
        Display(Search_name,Emp_ID,Name,Salary);
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
    public static void Display(String Search_name,int[] Emp_ID,String[] Name,double[] Salary)
    {
        System.out.println("Emp_ID\tName\tSalary");
        System.out.println("------------------------");
        for(int i=0;i<Emp_ID.length;++i)
        {
            if(Name[i].equals(Search_name))
            {
            System.out.print(Emp_ID[i]+"\t");
            System.out.print(Name[i]+"\t");
            System.out.print(Salary[i]+"\n");
            }
        }
    }
}