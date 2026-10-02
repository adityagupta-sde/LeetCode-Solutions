class Solution {
    public boolean isPalindrome(int x) {
        int res = 0;
        int org = x;
        if(x < 0) return false;
        while(x > 0) {
            int rem = x % 10;
            x /= 10;
            res = res * 10 + rem;
        }
        if(res == org) return true;
        return false;
    }
}