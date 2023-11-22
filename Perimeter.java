import java.util.*;

class Perimeter {
    int l,b;
    Scanner sc=new Scanner(System.in);
    Perimeter()
    {
        System.out.print("Enter length: ");
        l=sc.nextInt();
        System.out.print("Enter breadth: ");
        b=sc.nextInt();
        System.out.println("Perimeter of rectangle is: "+(2*(l+b)));
    }
    
    Perimeter(int l,int b)
    {
        this.l=l;
        this.b=b;
        System.out.println("Perimeter of rectangle is: "+(2*(l+b)));
    }
}

public class Main{
    public static void main(String[] args){
        Perimeter obj1=new Perimeter();
        Perimeter obj2=new Perimeter(20,10);
    }
}
