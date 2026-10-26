class Solution {
    public int closedIsland(int[][] grid) {
        int a= grid.length;
        int b= grid[0].length;
        int value=0;
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(grid[i][j]==0){
                    if(dfs(grid,i,j)){
                        value++;
                    }
                }
            }
        }
        return value;
    }
    private boolean dfs(int[][] grid, int r, int c){
        int a= grid.length;
        int b= grid[0].length;
        if(r<0 || c<0 || r>=a || c>=b){
            return false;
        }
        if(grid[r][c]==1){
            return true;
        }
        grid[r][c]=1;
        boolean up= dfs(grid,r-1,c);
        boolean down= dfs(grid,r+1,c);
        boolean left= dfs(grid,r,c-1);
        boolean right= dfs(grid,r,c+1);
        return up && down && left && right;
    }
}