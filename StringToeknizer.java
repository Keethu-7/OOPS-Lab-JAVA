import java.util.*;

public class StringToken{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a line of integers separated by spaces: ");
        String inputLine = sc.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        int sum = 0;
        System.out.println("Individual integers: ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int currentNumber = Integer.parseInt(token);
            System.out.print(currentNumber+" ");
            sum += currentNumber;
        }
        System.out.println();
        System.out.println("\nSum of integers: " + sum);
    }
}
