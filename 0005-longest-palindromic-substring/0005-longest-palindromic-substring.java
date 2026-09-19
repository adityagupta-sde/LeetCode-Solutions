class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;

        for(int i=0; i<n; i++) {
            char c = s.charAt(i);
            int left = i;
            int right = i;
            
            while(left >=0 && s.charAt(left) == c) {
                left--;
            }
            while(right < n && s.charAt(right) == c) {
                right++;
            }
            while(left >= 0 && right < n) {
                if(s.charAt(left) != s.charAt(right)) {
                    break;
                }
                left--;
                right++;
            }
            left++;
            while(end - start < right - left) {
                end = right;
                start = left;
            }
        }
        return s.substring(start,end);
    }
}