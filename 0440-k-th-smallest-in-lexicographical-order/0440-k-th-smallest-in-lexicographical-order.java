class Solution {
    public int findKthNumber(int n, int k) {
         int curr = 1;
        k = k - 1;  // Because we start from 1
//abhinav
        while (k > 0) {
            long count = getCount(n, curr, curr + 1);
            if (count <= k) {
                // Skip the whole subtree
                k -= count;
                curr += 1;
            } else {
                // Go one level deeper
                k -= 1;
                curr *= 10;
            }
        }

        return curr;
    }

    private long getCount(int n, long first, long last) {
        long count = 0;
        while (first <= n) {
            count += Math.min(n + 1, last) - first;
            first *= 10;
            last *= 10;
        }
        return count;
    }
}