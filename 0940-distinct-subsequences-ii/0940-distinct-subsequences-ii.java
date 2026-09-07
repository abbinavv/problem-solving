class Solution {
    public int distinctSubseqII(String s) {

        int MOD = 1000000007;

        long[] dp = new long[26];

        long total = 0;

        for (char c : s.toCharArray()) {

            int index = c - 'a';

            long newSubseq = (total + 1) % MOD;

            total = (total + newSubseq - dp[index] + MOD) % MOD;

            dp[index] = newSubseq;
        }

        return (int) total;
    }
}