class Solution {
    public int maxDifference(String s) {
        int[] f= new int[26];
        for(char c : s.toCharArray()){
            f[c-'a']++;
        }int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        // Step 2: Check frequencies
        for (int count : f) {
            if (count == 0) continue;
            if (count % 2 == 1) {
                maxOdd = Math.max(maxOdd, count);
            } else {
                minEven = Math.min(minEven, count);
            }
        }

        // Step 3: Return the max difference
        return maxOdd - minEven;
    }
}