class Solution {
    public String addBinary(String a, String b) {
        int l1=a.length()-1;
        int l2=b.length()-1;
        int r=0;
        StringBuilder result = new StringBuilder();
         while (l1 >= 0 || l2 >= 0 || r > 0) {
            if (l1 >= 0) {
                r += a.charAt(l1) - '0';
                l1--; 
            }
            if (l2 >= 0) {
                r += b.charAt(l2) - '0';
                l2--;
            }
            result.append(r % 2);
            r /= 2;
        }
        return result.reverse().toString();
    }
}
