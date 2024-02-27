public class Swapping {
    
    public static void main(String args[]){
     /* int a = 24;
        int b = 4;
        // swapping of two numbers without using third variable
        a = a-b; // 24-4 = 20
        b = a+b; // 20+4 = 24(b)
        a = b-a; // 24-20 = 4(a)
        System.out.println("a = "+a+" b = "+b); */

        // swapping without using addition and subtraction
        int a = 7;
        int b = 6;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a+" b = "+b);
    }
}
