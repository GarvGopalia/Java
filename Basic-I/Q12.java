import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the number : ");
        int a = sc.nextInt();

        System.out.println("Input the number : ");
        int b = sc.nextInt();

        System.out.println("Input the number : ");
        int c = sc.nextInt();
        sc.close();

        System.out.println("Average of three numbers are : "+(a + b + c)/3);

    }
}
