class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int first=0;
        int result=1;
        for(int second=1; second<arr.length; second++){
            if(arr[second]==arr[second-1]){
                first=second;
            }
            else if(second>=2){
                boolean previousGreater= arr[second-1]> arr[second-2];
                boolean currentGreater= arr[second]> arr[second-1];
                if(previousGreater== currentGreater){
                    first= second-1;
                }
            }
            result= Math.max(result, second-first+1);
        }
        return result;
    }
}