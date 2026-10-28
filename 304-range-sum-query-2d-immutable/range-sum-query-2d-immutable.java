class NumMatrix {
private int[][] p;
    public NumMatrix(int[][] matrix) {
        int a= matrix.length;
        int b= matrix[0].length;
        p= new int[a+1][b+1];
        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){
                p[i][j]= matrix[i-1][j-1]+ p[i-1][j]+ p[i][j-1]- p[i-1][j-1];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return p[row2+1][col2+1]- p[row1][col2+1]- p[row2+1][col1]+ p[row1][col1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */