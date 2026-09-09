class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long pow = 1000;
        long commas = 1;
        while (pow <= n) {
            long end = Math.min(n, pow * 1000 - 1);
            ans += (end - pow + 1) * commas;
            pow *= 1000;
            commas++;
        }
        return ans;
    }
}