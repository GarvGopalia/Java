public class stocks {
    public static int SP(int price[]) {
        int n = price.length;
        int maxProfit = 0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(price[j]-price[i] > 0) {
                    int profit = price[j]-price[i];
                    maxProfit = Math.max(maxProfit,profit);
                } 
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(SP(price));
    }
}