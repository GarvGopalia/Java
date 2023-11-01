import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        b =sc.nextInt();
        System.out.println("Before Swapping a :" +a  + ","+" b :"+b);
        c = a;
        a = b;
        b = c;
        sc.close();
        System.out.println("After Swapping a :" +a + "," + " b :"+b);
    }
}
