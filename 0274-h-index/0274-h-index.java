class Solution {
    public int hIndex(int[] citations) {
        for(int i=0;i<citations.length-1;i++){
            int selection =i;
            for(int j=i+1;j<citations.length;j++){
                if(citations[selection]>citations[j]){
                    selection=j;
                }
            }
            int temp=citations[selection];
            citations[selection]=citations[i];
            citations[i]=temp;
        }
        int n=citations.length;
        for(int i=0;i<n;i++){
            int h=n-i;
            if(citations[i]>=h){
                return h;

            }

        }
        return 0;
        
        

        
    }
}