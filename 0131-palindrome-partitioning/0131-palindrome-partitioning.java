class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(0, 0, s, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int st, int end, String s, List<String> curr, List<List<String>> ans) {
        if(end == s.length() - 1) {
            if(isPalindrome(st, end, s)) {
                curr.add(s.substring(st, end+1));
                ans.add(curr);
            }
            return;
        }
        if(isPalindrome(st, end, s)) {
            List<String> list = new ArrayList<>(curr);
            list.add(s.substring(st, end+1));
            solve(end+1, end+1, s, list, ans);
        }
        solve(st, end+1, s, curr, ans);    
    }

    private boolean isPalindrome(int st, int end, String s) {
        while(st < end) {
            if(s.charAt(st++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}