import java.util.*;

class Patient
{
    int ID,age;
    char BloodData;
    Patient()
    {
        ID=0;
        age=0;
        BloodData='0';
    }
    
    Patient(int ID,int age,char BloodData)
    {
        this.ID=ID;
        this.age=age;
        this.BloodData=BloodData;
    }
    
    int getID()
    {
        return ID;
    }
    
    int getage()
    {
        return age;
    }
    
    char getBloodData()
    {
        return BloodData;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter id: ");
        int id=sc.nextInt();
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        System.out.print("Enter blood data: ");
        char data=sc.next().charAt(0);
        Patient patient=new Patient(id,age,data);
        System.out.println("ID: "+patient.getID());
        System.out.println("AGE: "+patient.getage());
        System.out.println("BLOOD DATA: "+patient.getBloodData());
    }
}
