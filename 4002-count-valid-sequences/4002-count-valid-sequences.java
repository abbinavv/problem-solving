class Solution {
    static final int MOD = 1_000_000_007;

    public int countValidSequences(int n, int k) {
        if (k > n) return 0;

        int max = n;
        if ((n - k) % 2 == 0) {
            max = Math.max(max, (n + k - 2) / 2);
        }

        long[] fact = new long[max + 1];
        long[] invFact = new long[max + 1];

        fact[0] = 1;
        for (int i = 1; i <= max; i++)
            fact[i] = fact[i - 1] * i % MOD;

        invFact[max] = modPow(fact[max], MOD - 2);
        for (int i = max - 1; i >= 0; i--)
            invFact[i] = invFact[i + 1] * (i + 1) % MOD;

        long total = C(n - 1, k - 1, fact, invFact);

        long oddOnly = 0;
        if ((n - k) % 2 == 0) {
            int m = (n + k - 2) / 2;
            oddOnly = C(m, k - 1, fact, invFact);
        }

        return (int)((total - oddOnly + MOD) % MOD);
    }

    long C(int N, int R, long[] fact, long[] invFact) {
        if (R < 0 || R > N) return 0;
        return fact[N] * invFact[R] % MOD * invFact[N - R] % MOD;
    }

    long modPow(long a, long e) {
        long res = 1;
        while (e > 0) {
            if ((e & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            e >>= 1;
        }
        return res;
    }
}