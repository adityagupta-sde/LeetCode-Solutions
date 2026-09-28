class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxDep = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') count++;
            if(s.charAt(i) == ')') count--;
            maxDep = Math.max(count, maxDep);
        }
        return maxDep;
    }
}