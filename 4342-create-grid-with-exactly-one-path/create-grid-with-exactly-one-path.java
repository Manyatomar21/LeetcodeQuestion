class Solution {
    public String[] createGrid(int m, int n) {
        String grid[]= new String[m];
       for(int i=0; i<m; i++){
        StringBuilder row= new StringBuilder();
        for(int j=0; j<n; j++){
            row.append('#');
        }
        grid[i]= row.toString();
       }
       StringBuilder startingRow= new StringBuilder();
       for(int j=0; j<n; j++){
        startingRow.append('.');
       }
       grid[0]= startingRow.toString();
       for(int i=1; i<m; i++){
        StringBuilder row= new StringBuilder(grid[i]);
        row.setCharAt(n-1,'.');
        grid[i]= row.toString();
       }
       return grid;
    }
}
