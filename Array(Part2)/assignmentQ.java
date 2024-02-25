public class assignmentQ {
    public static boolean q1(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[i]==nums[j]) {
                    return true;
                } 
        }
    }
    return false;
}

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(q1(nums));
    }
    
}