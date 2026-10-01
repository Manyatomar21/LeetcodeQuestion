class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zeroTotal=0;
        int result=0;
        for(int right=0; right<nums.length; right++){
            if(nums[right]==0){
                zeroTotal++;
            }
            while(zeroTotal>1){
                if(nums[left]==0){
                    zeroTotal--;
                }
                left++;
            }
            result= Math.max(result, right-left);
        }
        return result;
    }
}