class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows=mat.length;
        int colms=mat[0].length;
        if(rows*colms!=r*c){
            return mat;
        }
        if((r==rows)&&(c==colms)){
            return mat;
        }
        int[][] newmat=new int[r][c];
        int row=0;
        int colm=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<colms;j++){
                newmat[row][colm]=mat[i][j];
                colm++;
                if(colm==c){
                    colm=0;
                    row++;
                }
            }
        }
        return newmat;
        

        
    }
}