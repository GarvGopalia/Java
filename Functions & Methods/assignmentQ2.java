import java.util.Scanner;

public class assignmentQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("Enter the number : ");
        a = sc.nextInt();

        if(isEven(a)) {
            System.out.println("Number is even");
        }else {
            System.out.println("Number is odd");
        }
    }

    public static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}