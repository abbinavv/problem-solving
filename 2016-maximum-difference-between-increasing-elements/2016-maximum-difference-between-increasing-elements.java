class Solution {
    public int maximumDifference(int[] nums) {
        int max_Diff = -1;
        for(int i =0;i<nums.length;i++){
            for( int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    max_Diff = Math.max(max_Diff,nums[j]-nums[i]);
                }
            }
        }
     return max_Diff;
    }
}