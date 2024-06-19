public class Friends {
    public static int pairing(int n) {
        if(n == 1 || n == 2) {
            return n;
        }
        
        int s = pairing(n-1);

        int p = (n-1) * pairing(n-2);

        int totalWays = s + p;
        return totalWays;
    }
    public static void main(String[] args) {
       System.out.println(pairing(4));
    }
}