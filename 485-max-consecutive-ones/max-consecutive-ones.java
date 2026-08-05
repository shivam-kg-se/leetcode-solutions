class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1=0, max2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max2++;
            }
            else{
                max2=0;
            }
            max1=Math.max(max1,max2);
    
        }
        return max1;
    }
}