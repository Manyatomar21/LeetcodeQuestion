class Solution {
    public int pivotIndex(int[] nums) {
        int leftoverSum=0;
        for(int value:nums){
            leftoverSum+= value;
        }
        int leftPortionSum=0;
        for(int position=0; position<nums.length; position++){
            leftoverSum-= nums[position];
            if(leftPortionSum==leftoverSum){
                return position;
            }
            leftPortionSum+= nums[position];
        }
        return -1;
    }
}