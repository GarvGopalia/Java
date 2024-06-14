public class Fibonacci {
    public static int printFib(int n) {
        if(n == 1) {
            return 1;
        } 
        if(n == 0) {
            return 0;
        }
        int fibN = printFib(n-1) + printFib(n-2);
        return fibN;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(printFib(n));
    }
}
