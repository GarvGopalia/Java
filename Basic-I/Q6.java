import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Input second number: ");
        int num2 = sc.nextInt();
        sc.close();

        System.out.println(num1 + "x" + num2 + "=" + num1*num2);


    }
}
