class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE; 
        int csum = 0;
        for(int i = 0; i < nums.length; i++){
            csum += nums[i];
            max = Math.max(csum, max);
            if(csum < 0) csum = 0;
        }
        return max;
    }
}