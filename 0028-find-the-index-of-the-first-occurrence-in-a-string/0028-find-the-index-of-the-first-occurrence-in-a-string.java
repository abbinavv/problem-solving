class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for(int i =0;i<=n-m;i++){
            int j =0;
            for( j =0;j<m;j++){
                if(needle.charAt(j)!=haystack.charAt(i+j)){
                    break;
                }
            }
                if(j==m){
                    return i;
                }
                
            
        }
        return -1;
    }
}