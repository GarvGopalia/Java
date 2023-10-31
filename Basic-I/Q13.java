import java.util.Scanner;



public class Q13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Input the Height : ");
        int h = sc.nextInt();

        System.out.println("Input the Width : ");
        int w = sc.nextInt();
        sc.close();

        System.out.println("Area is " +w*h);
        System.out.println("Perimeter is :" +2*(w+h));
    }
}
