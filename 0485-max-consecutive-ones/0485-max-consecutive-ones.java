class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, curr=0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(nums[i]==0){
                curr = 0;
            }
            else{
                curr++;
                res = Math.max(res,curr);
            }
        }
        return res;
    }
}