class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rows=matrix.length;
        int colms=matrix[0].length;
        for(int i=0;i<rows-1;i++){
            for(int j=0;j<colms-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
        
    }
}