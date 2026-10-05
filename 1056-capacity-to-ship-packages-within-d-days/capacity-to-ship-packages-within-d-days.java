class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight: weights){
            low= Math.max(low,weight);
            high+= weight;
        }
        while(low<high){
            int mid= low+(high-low)/2;
            int requiredDays=1;
            int actualWeight=0;
            for(int weight:weights){
                if(actualWeight+weight>mid){
                    requiredDays++;
                    actualWeight=0;
                }
                actualWeight+= weight;
            }
            if(requiredDays<=days){
                high= mid;
            } else{
                low= mid+1;
            }
        }
        return low;
    }
}