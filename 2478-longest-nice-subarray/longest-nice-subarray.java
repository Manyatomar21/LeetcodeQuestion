class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0;
        int usedBits=0;
        int result=0;
        for(int right=0; right<nums.length; right++){
            while((usedBits & nums[right])!=0){
                usedBits^= nums[left];
                left++;
            }
            usedBits|= nums[right];
            result= Math.max(result, right-left+1);
        }
        return result;
    }
}