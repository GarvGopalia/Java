public class fncOverloading {
    public static void main(String[] args) {
        System.out.println(sum(5, 3));
        System.out.println(sum(5.0f, 3.0f));
        System.out.println(sum(5, 2, 1));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b +c;
    }
    public static float sum(float a, float b) {
        return a + b;
    }
}