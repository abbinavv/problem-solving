class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long pow = 1000;
        long commas = 1;
        while (pow <= n) {
            ans += (n - pow + 1) * commas;
            pow *= 1000;
            commas++;
        }
        return ans;
    }
}