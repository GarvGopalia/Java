public class Factorial {
    public static int printFact(int n) {
        if(n == 0) {
            return 1;
        }

        int fnm1 = printFact(n-1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(printFact(n));
    }
}
