class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] right = new int[nums.length];
        int prod=1;
        for(int i=nums.length-1;i>=0;i--){
            prod*=nums[i];
            right[i]=prod;
        }
        int[] res= new int[nums.length];
        prod=1;
        for(int i=0;i<nums.length-1;i++){
            int lp=prod;
            int rp=right[i+1];
            res[i]= lp*rp;
            prod*=nums[i];
        }
        res[res.length-1]=prod;
        return res;
    }
}