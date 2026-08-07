class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int pi=0;
        int ni=1;
        for(int num:nums){
            if(num>0){
                ans[pi]=num;
                pi+=2;
            }
            else{
                ans[ni]=num;
                ni+=2;
            }
        }
        return ans;
    }
}