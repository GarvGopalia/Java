import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        
        long n1,n2;
        int i = 0, rem = 0;

        int[] sum = new int[20];

        Scanner sc = new Scanner("System.in");
        sc.close();

        System.out.println("Enter the 1st binary number :");
        n1 = sc.nextLong();

        System.out.println("Enter the 2ndt binary number :");
        n2 = sc.nextLong();

        while (n1 !=0 || n2 !=0) {
            sum[i++] = (int)((n1%10+n2%10+rem)%2);
            
        }
    }
}
