class Solution {
    public int countCommas(int n) {
        int ans = 0;
        int pow = 1000;
        int commas = 1;

        while (pow <= n) {
            ans += (n - pow + 1) * commas;
            pow *= 1000;
            commas++;
        }
        return ans;
    }
}