class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int currentMax=0;
        int currentMin=0;
        int bestMax= nums[0];
        int bestMin= nums[0];
        for(int num:nums){
            currentMax= Math.max(num, currentMax+num);
            bestMax= Math.max(bestMax, currentMax);
            currentMin= Math.min(num, currentMin+num);
            bestMin= Math.min(bestMin, currentMin);
            total+=num;
        }
        if(bestMax<0){
            return bestMax;
        }
        return Math.max(bestMax, total-bestMin);
    }
}