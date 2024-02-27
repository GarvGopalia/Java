public class assignmentQ {

    public static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int swap = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] < arr[i]) {
                //swapping
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                swap++;
                }
            }
            if(swap == 0) {
                System.out.println("array is already sorted");
                break;
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length-1; j++) {
                if(arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            for(int j=1; j<arr.length-1; j++) {
                
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        selectionSort(arr);
        printArr(arr);
    }
}
