class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int currentNum : nums) {
            if (count == 0 || currentNum != nums[count - 1]) {
                nums[count++] = currentNum;
            }
        }
        return count;
    }
}
