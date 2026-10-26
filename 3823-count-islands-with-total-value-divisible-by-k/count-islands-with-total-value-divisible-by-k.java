class Solution {
    public int countIslands(int[][] grid, int k) {
        int a= grid.length;
        int b= grid[0].length;
        int value= 0;
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(grid[i][j]>0){
                    long sum= dfs(grid,i,j,a,b);
                    if(sum%k==0){
                        value++;
                    }
                }
            }
        }
        return value;
    }
    private long dfs(int[][] grid, int r, int c, int a, int b){
        if(r<0 || c<0 || r>=a || c>=b || grid[r][c]==0){
            return 0;
        }
        long sum= grid[r][c];
        grid[r][c]= 0;
        sum+= dfs(grid,r+1,c,a,b);
        sum+= dfs(grid,r-1,c,a,b);
        sum+= dfs(grid,r,c+1,a,b);
        sum+= dfs(grid,r,c-1,a,b);
        return sum;
    }
}