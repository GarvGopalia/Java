public class PracticeQ1 {
    public static void MergeSort(int arr[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + (si - ei)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr, si, mid, ei);
    }
    public static int Merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= ei) { 
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= ei) {
            temp[k++] = temp[j++];
        }

        for(k=0,i=si; k<temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        String arr[] = {"sun","earth","mars","mercuery"};
    }
}
