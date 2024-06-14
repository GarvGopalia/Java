public class Expo {
    public static int printExpo(int x, int n) {
        if(n == 0) {
            return 1;
        }
        
        int half =  printExpo(x, n/2) * printExpo(x, n/2);
        return half;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(printExpo(x, n));
    }
}