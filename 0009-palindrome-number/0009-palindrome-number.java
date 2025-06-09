class Solution {
    public boolean isPalindrome(int x) {
        int k=x,sum=0;//abhinav
            if (x < 0)
            {    return false;
            }
             while(x!=0)
             {
                int temp = x%10;
                 sum = sum*10+temp;
                x=x/10;
             }
             if(sum==k)
             {
                return true;
             }
             else
             {
                return false;
             }
    }
}