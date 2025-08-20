class Solution {
    public String longestPalindrome(String s) {
        int start = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 2; j++) {
                int l = i, r = i + j;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                    if (r - l + 1 > maxLen) {
                        start = l;
                        maxLen = r - l + 1;
                    }
                    l--; r++;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
