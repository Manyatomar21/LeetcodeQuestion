class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start= findStart(nums,target);
        int end= findEnd(nums,target);
        return new int[]{start,end};
    }
    private int findStart(int[]nums, int target){
        int low=0;
        int high= nums.length-1;
        int result= -1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target){
                result=mid;
                high= mid-1;
            } else if(nums[mid]<target){
                low= mid+1;
            } else{
                high= mid-1;
            }
        }
        return result;
    }
    private int findEnd(int[]nums, int target){
        int low=0;
        int high= nums.length-1;
        int result= -1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid]==target){
                result= mid;
                low= mid+1;
            } else if(nums[mid]<target){
                low= mid+1;
            } else{
                high= mid-1;
            }
        }
        return result;
    }
}