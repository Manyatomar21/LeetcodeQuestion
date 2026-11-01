class Solution {
    public int minMoves(int[] nums) {
        int min= nums[0];
        for(int num:nums){
            min= Math.min(min,num);
        }
        int chances=0;
        for(int num:nums){
            chances+= num-min;
        }
        return chances;
    }
}