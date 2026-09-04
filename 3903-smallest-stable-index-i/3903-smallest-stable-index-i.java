class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];
        int score = 0;
        for(int i =0;i<n;i++){
            max = Math.max(max,nums[i]);
            int min = nums[i];
            for(int j =i;j<n;j++){
                min = Math.min(min,nums[j]);
            }
            score = max-min;
            if(score<=k){
                return i;
            }
        }
        return -1;
    }
}