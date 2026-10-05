class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low=1;
        int high=0;
        for(int candy: candies){
            high= Math.max(high,candy);
        }
        int result=0;
        while(low<=high){
            int mid= low+(high-low)/2;
            long children=0;
            for(int candy:candies){
                children+= candy/mid;
            }
            if(children>=k){
                result=mid;
                low= mid+1;
            } else{
                high= mid-1;
            }
        }
        return result;
    }
}