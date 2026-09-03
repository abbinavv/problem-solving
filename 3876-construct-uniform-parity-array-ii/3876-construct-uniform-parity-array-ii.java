class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];
      for(int i : nums1){
        min = Math.min(min,i);
      }
      if (min % 2 == 1) {
            return true;
        }
        for (int num : nums1) {
            if (num % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}