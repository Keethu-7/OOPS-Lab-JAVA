import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int pal=0;
        System.out.print("Enter string: ");
        String x=sc.next();
        x=x.replaceAll("//s","").toLowerCase();
        int i=0;
        int j=x.length()-1;
        while(i<=j){
            if(x.charAt(i) != x.charAt(j)){
                pal=1;
                break;
            }
            i++;
            j--;
        }
        if (pal==1){
            System.out.println("String is not a palindrome");
        }
        else{
            System.out.println("String is a palindrome");
        }
    }
}
