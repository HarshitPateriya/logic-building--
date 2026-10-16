class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int colms=matrix[0].length;
        int[][] result=new int[colms][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                result[j][i]=matrix[i][j];
            }
        }
        return result;
        
    }
}