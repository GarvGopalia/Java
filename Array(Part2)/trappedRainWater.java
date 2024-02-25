public class trappedRainWater {

    public static int rainWater(int height[]) {
        int n = height.length;
        //claculate left max bounary - array
        int leftMax[] = new int [n];
        leftMax[0] =  height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //claculate right max bounary - array
        int rightMax[] = new int [n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedRain = 0;
        //loop
        for(int i=0; i<n; i++) {
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedwater = (waterLevel - heights[i])
            trappedRain += waterLevel - height[i];
        } 
        return trappedRain;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.print(rainWater(height));
    }
}