class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remainderCount= new int[k];
        remainderCount[0]=1;
        int runningTotal=0;
        int totalSubarrays=0;
        for(int num:nums){
            runningTotal+=num;
            int rem= runningTotal%k;
            if(rem<0){
                rem+=k;
            }
            totalSubarrays+= remainderCount[rem];
            remainderCount[rem]++;
        }
        return totalSubarrays;
    }
}