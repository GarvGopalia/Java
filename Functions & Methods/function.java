import java.util.*;
public class function {
    public static void printHelloWorld() {
        System.out.println("hello world");
    }

    public static int calculateSum(int a , int b) {
        
        int sum = a + b;
        return sum;
        
    }
    public static void main(String[] args) {
        int a=5,b=6;
        int c;
        c=a;
        a=b;
        b=c;

        System.out.println("a =" +a);
        System.out.println("b =" +b);
}
 
}
