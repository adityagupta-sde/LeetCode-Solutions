class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder builder = new StringBuilder();
        int bal = 0;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                if(bal > 0) {
                    builder.append(ch);
                }
                bal++;
            }
            if(ch == ')') {
                bal--;
                if(bal > 0) {
                    builder.append(ch);
                }
            }
        }
        return builder.toString();
    }
}
