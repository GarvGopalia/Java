import java.util.Scanner;

public class assignmentQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("enter the value of a: ");
        int b = sc.nextInt();
        System.out.println("enter the value of a: ");
        int c =sc.nextInt();
        System.out.println("The average value is" + avg(a , b, c)+"\n");

    }

    // Question 1;
    public static int avg(int a, int b, int c) {
        
        return (a + b + c)/3;
    }

}
