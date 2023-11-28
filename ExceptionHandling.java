import java.util.*;
public class ExceptionHandling{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter two numbers for division:");
            int num=sc.nextInt();
            int den= sc.nextInt();
            double result=num/den;
            System.out.println("Result of division is: "+result);
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible");
        }
        
        catch (Exception e) {
            System.out.println("An unexpected exception occurred");
        }
        
        finally {
            System.out.println("Finally block executed");
        }
    }
}
