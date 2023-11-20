import java.util.*;
public class Prime
{
	public static void main(String[] args) {
	    int count=0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
		    if(num%i==0)
		    {
		            count=count+1;
		    }
		}
		if(num==1)
		{
		    System.out.println("1 is neither prime nor composite");
		}
		else if(count==0)
		{
		    System.out.println("Number is prime");
		}
		else
		{
		    System.out.println("Number is composite");
		}
	}
}
