import java.util.*;

class Shirt{
    int cs,sl;
    String material="cotton";
    
    Shirt(int cs,int sl)
    {
        this.cs=cs;
        this.sl=sl;
    }
    
    void display()
    {
        System.out.println("Collar size: "+cs);
        System.out.println("Sleeve length: "+sl);
        System.out.println("Material: "+material);
        System.out.println();
    }
}

public class TestShirt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter collar size of shirt 1: ");
        int cs1=sc.nextInt();
        System.out.print("Enter sleeve length of shirt 1: ");
        int sl1=sc.nextInt();
        Shirt obj1=new Shirt(cs1,sl1);
        
        System.out.print("Enter collar size of shirt 2: ");
        int cs2=sc.nextInt();
        System.out.print("Enter sleeve length of shirt 2: ");
        int sl2=sc.nextInt();
        Shirt obj2=new Shirt(cs2,sl2);
        
        System.out.print("Enter collar size of shirt 3: ");
        int cs3=sc.nextInt();
        System.out.print("Enter sleeve length of shirt 3: ");
        int sl3=sc.nextInt();
        Shirt obj3=new Shirt(cs3,sl3);
        
        System.out.println();
        System.out.println("Shirt details of shirt 1");
        obj1.display();
        System.out.println("Shirt details of shirt 2");
        obj2.display();
        System.out.println("Shirt details of shirt 3");
        obj3.display();
    }
}
