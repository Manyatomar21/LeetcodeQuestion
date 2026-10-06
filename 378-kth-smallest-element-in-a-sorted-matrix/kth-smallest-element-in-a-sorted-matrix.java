class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n= matrix.length;
        int low= matrix[0][0];
        int high= matrix[n-1][n-1];
        while(low<high){
            int mid= low+(high-low)/2;
            int value=0;
            for(int row=0; row<n; row++){
                value+= valueLessEqual(matrix[row],mid);
            }
            if(value<k){
                low= mid+1;
            } else{
                high= mid;
            }
        }
        return low;
    }
    private int valueLessEqual(int[] row, int target){
        int low=0;
        int high= row.length;
        while(low<high){
            int mid= low+(high-low)/2;
            if(row[mid]<= target){
                low= mid+1;
            } else{
                high= mid;
            }
        }
        return low;
    }
}