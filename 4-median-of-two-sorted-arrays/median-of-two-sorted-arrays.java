class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length> nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        int m= nums1.length;
        int n= nums2.length;
        int low=0;
        int high=m;
        while(low<=high){
            int mid1= low+(high-low)/2;
            int mid2= (m+n+1)/2-mid1;
            int low1= (mid1==0)? Integer.MIN_VALUE: nums1[mid1-1];
            int high1= (mid1==m)? Integer.MAX_VALUE: nums1[mid1];
            int low2= (mid2==0)? Integer.MIN_VALUE: nums2[mid2-1];
            int high2= (mid2==n)? Integer.MAX_VALUE: nums2[mid2];
            if(low1<=high2 && low2<=high1){
                if((m+n)%2==1){
                    return Math.max(low1,low2);
                }
                int lowMax= Math.max(low1,low2);
                int highMin= Math.min(high1,high2);
                return (lowMax+highMin)/2.0;
            }
            if(low1>high2){
                high= mid1-1;
            } else{
                low= mid1+1;
            }
        }
        return 0.0;
    }
}