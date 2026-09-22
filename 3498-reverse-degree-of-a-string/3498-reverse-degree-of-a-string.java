class Solution {
    public int reverseDegree(String s) {
        int n = s.length();
        int sum =0;
        for(int i =0;i<n;i++){
            int rev = 26 - (s.charAt(i) - 'a');
            int prod = i+1;
            sum += rev * prod;
        }
        return sum;
    }
}