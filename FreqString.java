import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String txt=sc.next();
        int n=txt.length();
        int count=0;
        System.out.print("Enter character: ");
        char c = sc.next().charAt(0); 
        for(int i=0;i<n;i++){
            if(c==txt.charAt(i)){
                count++;
            }
        }
        System.out.println("Frequency of "+c+" in "+txt+" is: "+count);
    }
}
