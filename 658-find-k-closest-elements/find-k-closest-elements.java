class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       int leftSide=0;
       int rightSide= arr.length-k;
       while(leftSide<rightSide){
        int mid= leftSide+(rightSide-leftSide)/2;
        if(x-arr[mid]>arr[mid+k]-x){
            leftSide=mid+1;
        } else{
            rightSide=mid;
        }
}   
List<Integer> ans= new ArrayList<>();
for(int i=leftSide; i<leftSide+k; i++){
    ans.add(arr[i]);
}
return ans;
    }
}