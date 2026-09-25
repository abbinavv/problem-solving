class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int min = nums[0];

        for(int i =0;i<n;i++){
                    int temp = nums[i];
                int sum=0;
            while(temp!=0){
                int rev= temp%10;
                temp/=10;
                sum += rev;
            }
                if(sum==i){
                    return i;
                }
        }
        return -1;
    }
}