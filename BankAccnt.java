import java.util.*;

class BankAccnt {
    String name,type;
    int AccNo,BalAmt;
    Scanner sc=new Scanner(System.in);

    public void assign(String name,int AccNo,String type,int BalAmt)
    {
        this.name=name;
        this.AccNo=AccNo;
        this.type=type;
        this.BalAmt=BalAmt;
    }
    
    public void deposit()
    {
        //Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int amt=sc.nextInt();
        BalAmt=BalAmt+amt;
        System.out.println("Successfully deposited");
        System.out.println("Amount in account: "+BalAmt);
    }
    
    public void withdraw()
    {
        //Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int amt=sc.nextInt();
        if(amt>BalAmt)
        {
            System.out.println("Entered amount greater than balance amount in account");
            System.out.println("Amount in account: "+BalAmt);
        }
        else
        {
            BalAmt=BalAmt-amt;
            System.out.println("Successfully withdrawn");
            System.out.println("Amount in account: "+BalAmt);
        }
        
    }
    
    public void display()
    {
        System.out.println("Name of the depositor is "+name);
        System.out.println("Balance amount in account: "+BalAmt);
    }
}

public class Main{
    public static void main(String args[]){
        BankAccnt obj=new BankAccnt();
        obj.assign("Keerthana",2345,"Savings",10000);
        obj.deposit();
        obj.withdraw();
        obj.display();
        System.out.println("Program completed");
    }
}
