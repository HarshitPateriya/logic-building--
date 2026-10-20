class Solution {
    public int calPoints(String[] operations) {
        int[] score= new int[operations.length];
        int Size=0;
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if(op.equals("C")){
                Size--;
            } else if(op.equals("D")){
                score[Size]=2*score[Size-1];
                Size++;
            } else if(op.equals("+")){
                score[Size]=score[Size-1]+score[Size-2];
                Size++;
            } else{
                score[Size]=Integer.parseInt(op);
                Size++;

            }

        }
        int sum=0;
            for(int i=0;i<Size;i++){
                sum+=score[i];
            }
        return sum;    
        
    }
}