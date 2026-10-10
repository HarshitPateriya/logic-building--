class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;
        int digitsum=0;
        for(int num:nums){
            elementsum=elementsum+num;
            while(num>0){
                digitsum+=num%10;
                num/=10;

            }
        }
        return Math.abs(elementsum-digitsum);
        
    }
}