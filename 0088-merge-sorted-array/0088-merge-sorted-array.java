class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int indexNums1 = m - 1; 
        int indexNums2 = n - 1; 
        int mergedIndex = m + n - 1;
        while (indexNums2 >= 0) {
            if (indexNums1 < 0 || nums1[indexNums1] <= nums2[indexNums2]) {
                nums1[mergedIndex] = nums2[indexNums2]; 
                indexNums2--; 
            } else {
                nums1[mergedIndex] = nums1[indexNums1];
                indexNums1--; 
            }
            mergedIndex--; 
        }

    }
}