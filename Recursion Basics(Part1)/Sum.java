public class Sum {
    public static int printSum(int n) {
        if(n == 1) {
            return 1;
        }

        int s = printSum(n-1);
        int sum = n + s;
        return sum;

    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(printSum(n));
    }
}
