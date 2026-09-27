class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        String curr ="";
        for(char c :  s.toCharArray()){
            if(c=='('){
                st.push(curr);
                curr ="";
            }
            else if(c==')'){
                curr = st.pop()+new StringBuilder(curr).reverse();
            }
            else{
                curr +=c;
            }
        }
        return curr;
    }
}