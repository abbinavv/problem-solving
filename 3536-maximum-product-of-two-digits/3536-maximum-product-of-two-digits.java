class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> digit = new ArrayList<>();
        int max = 0;

        while (n > 0) {
            digit.add(n % 10);
            n /= 10;
        }

        for(int i =0;i<digit.size();i++){
            for(int j = i+1;j<digit.size();j++){
                max = Math.max(max,digit.get(i)*digit.get(j));
            }
        }
        return max;
    }
}