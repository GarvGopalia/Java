public class PracticeQuestion {
    public static void Q1(int key, int arr[], int n) {
        if(n == arr.length) {
            return;
        }
        if(arr[n] == key) {
            System.out.print(n+" ");
        }
        Q1(key, arr, n+1);
    }

    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void Q2(int n) {
        if(n == 0) {
            return;
        }
        int lastDigit = n%10;
        Q2(n/10);
        System.out.print(digits[lastDigit]+" ");
    }

    public static void main(String[] args) {

        //Question 1
        int key = 2;
        int arr[] = {3,2,4,5,6,2,7,2,2};
        Q1(key, arr, 0);
        System.out.println();

        //Question 2
         Q2(1234);
         System.out.println();
    }
}
