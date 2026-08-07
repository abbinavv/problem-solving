class Solution {
    public int smallestNumber(int n, int t) {
        int an = ans(n,t);
        return an;
    }
    public int ans(int n ,int t){
        int k = n;
        int pro = 1;
        while(n > 0){
            int temp = n %10;
            pro *= temp;
            n = n /10;
        }
        if(pro % t == 0){
            return k;
        }else{
            return ans(k+1,t);
        }

    }
}