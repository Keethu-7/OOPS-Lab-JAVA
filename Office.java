import java.util.*;

class Employee {
    String Name, Address;
    int Age, PhnNo, Salary;
    
    public void print_Salary() {
        System.out.println("Salary: "+Salary);
    }
}

class Officer extends Employee {
    String specialization;
    Officer() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter officer details: ");
        System.out.print("Enter name: ");
        Name= sc.nextLine();
        System.out.print("Enter age: ");
        Age= sc.nextInt();
        System.out.print("Enter phone number: ");
        PhnNo= sc.next();
        sc.nextLine();
        System.out.print("Enter address: ");
        Address= sc.nextLine();
        System.out.print("Enter salary: ");
        Salary= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter specialization: ");
        specialization= sc.nextLine();
        
    }
}

class Manager extends Employee {
    String department;
    Manager() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter manager details: ");
        System.out.print("Enter name: ");
        Name= sc.nextLine();
        System.out.print("Enter age: ");
        Age= sc.nextInt();
        System.out.print("Enter phone number: ");
        PhnNo= sc.next();
        sc.nextLine();
        System.out.print("Enter address: ");
        Address= sc.nextLine();
        System.out.print("Enter salary: ");
        Salary= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter department: ");
        department= sc.nextLine();
    }
}

public class Office {
    public static void main(String args[]) {
        Officer off=new Officer();
        System.out.println();
        Manager man=new Manager();
        
        
        System.out.println();
        System.out.println("Officer Details: \n");
        System.out.println("Name: "+off.Name);
        System.out.println("Age: "+off.Age);
        System.out.println("Phone number: "+off.PhnNo);
        System.out.println("Address: "+off.Address);
        off.print_Salary();
        System.out.println("Specialization: "+off.specialization);
        
        System.out.println();
        System.out.println("Manager Details: \n");
        System.out.println("Name: "+man.Name);
        System.out.println("Age: "+man.Age);
        System.out.println("Phone number: "+man.PhnNo);
        System.out.println("Address: "+man.Address);
        man.print_Salary();
        System.out.println("Department: "+man.department);
    }
}
