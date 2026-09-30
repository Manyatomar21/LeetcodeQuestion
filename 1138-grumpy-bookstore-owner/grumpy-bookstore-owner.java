class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied=0;
        for(int i=0; i<customers.length; i++){
            if(grumpy[i]==0){
                satisfied+= customers[i];
            }
        }
        int remainingCustomers= 0;
        for(int i=0; i<minutes; i++){
            if(grumpy[i]==1){
                remainingCustomers+= customers[i];
            }
        }
        int maxRemaining= remainingCustomers;
        for(int end=minutes; end<customers.length; end++){
            if(grumpy[end]==1){
                remainingCustomers+= customers[end];
            }
            int start= end-minutes;
            if(grumpy[start]==1){
                remainingCustomers-= customers[start];
            }
            maxRemaining= Math.max(maxRemaining, remainingCustomers);
        }
        return satisfied+ maxRemaining;
    }
}