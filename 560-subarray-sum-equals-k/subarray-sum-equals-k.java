class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        int startingSum=0;
        int value=0;
        for(int num:nums){
            startingSum+=num;
            if(map.containsKey(startingSum-k)){
                value+= map.get(startingSum-k);
            }
            map.put(startingSum,map.getOrDefault(startingSum,0)+1);
        }
        return value;
    }
}