import java.util.*;

class Shape {
    
    Scanner sc=new Scanner(System.in);
    void Area(int r)
    {
        System.out.println("Area of circle is: "+(3.14*r*r));
    }
    
    void Area(int l,int b)
    {
        System.out.println("Area of rectangle is: "+(l*b));
    }
    
    void Area(int base,float ht)
    {
        System.out.println("Area of traingle is: "+(0.5*base*ht));
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Shape obj1=new Shape();
        System.out.print("Enter radius: ");
        int radius=sc.nextInt();
        obj1.Area(radius);
        
        System.out.print("Enter length: ");
        int length=sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth=sc.nextInt();
        obj1.Area(length,breadth);
        
        System.out.print("Enter base: ");
        int base=sc.nextInt();
        System.out.print("Enter height: ");
        float height=sc.nextFloat();
        obj1.Area(base,height);
    }
}
