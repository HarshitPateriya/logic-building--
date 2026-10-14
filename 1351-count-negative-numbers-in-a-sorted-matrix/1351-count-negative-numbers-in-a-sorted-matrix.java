class Solution {
    public int countNegatives(int[][] grid) {
        int count =0;
        int rows=grid.length;
        int colms=grid[0].length;

        for(int i=0;i<rows;i++){
            int low=0;
            int high=colms-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(grid[i][mid]<0){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            count+=colms-low;
        }
        return count;
        
    }
}