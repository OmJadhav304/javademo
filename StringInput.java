import java.util.*;
public class StringInput {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the values:");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("Int: " +a);
        System.out.println("Double: " +b);
        System.out.println("String: " +s);  
    
    }
}
