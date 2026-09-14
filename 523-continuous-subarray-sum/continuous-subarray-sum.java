class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainderValue= new HashMap<>();
        remainderValue.put(0,-1);
        int prefixSum=0;
        for(int i=0; i<nums.length; i++){
            prefixSum+=nums[i];
            int remainder= prefixSum%k;
            if(remainderValue.containsKey(remainder)){
                int previousValue= remainderValue.get(remainder);
                if(i-previousValue>=2){
                    return true;
                }
                } else{
                    remainderValue.put(remainder, i);
                }
            }
             return false;
        }
}
