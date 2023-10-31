import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        double radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        radius = sc.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        sc.close(); 

        System.out.println("Perimeter is = " +perimeter);
        System.out.println("Area is = "+area);

    }
}
