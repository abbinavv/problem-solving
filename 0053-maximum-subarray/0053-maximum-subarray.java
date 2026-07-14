class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0], maxend=nums[0];
        int n = nums.length;
        for(int i = 1;i<n;i++){
            maxend=Math.max(maxend+nums[i],nums[i]);
            res = Math.max(res,maxend);
        }
        return res;
    }
}