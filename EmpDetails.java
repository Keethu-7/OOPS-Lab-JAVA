import java.util.*;

class Employee{
    String Emp_name,Emp_gender,Emp_designation,Emp_Address;
    int Emp_id,Emp_age,Emp_salary;
}
public class Main
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        Employee e[]=new Employee[n];
        for(int i=0;i<n;i++)
        {
            e[i]=new Employee();
            System.out.println("Details of "+(i+1)+" employee");
            System.out.print("Enter id: ");
            e[i].Emp_id=sc.nextInt();
            System.out.print("Enter name: ");
            e[i].Emp_name=sc.next();
            System.out.print("Enter gender: ");
            e[i].Emp_gender=sc.next();
            System.out.print("Enter designation: ");
            e[i].Emp_designation=sc.next();
            System.out.print("Enter address: ");
            e[i].Emp_Address=sc.next();
            System.out.print("Enter age: ");
            e[i].Emp_age=sc.nextInt();
            System.out.print("Enter salary: ");
            e[i].Emp_salary=sc.nextInt();
        }
        System.out.print("Enter id to be searched: ");
        int id=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(e[i].Emp_id==id)
            {
                System.out.println("Name: "+e[i].Emp_name);
                System.out.println("Gender: "+e[i].Emp_gender);
                System.out.println("Designation: "+e[i].Emp_designation);
                System.out.println("Address: "+e[i].Emp_Address);
                System.out.println("Age: "+e[i].Emp_age);
                System.out.println("Salary: "+e[i].Emp_salary);
            }
        }
    }
}
