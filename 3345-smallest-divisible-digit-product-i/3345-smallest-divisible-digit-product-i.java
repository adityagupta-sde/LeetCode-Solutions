class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (isValid(n, t)) {
                return n;
            }
            n++;
        }
    }
    private boolean isValid(int num, int t) {
        int product = 1;
        int temp = num;
        if (temp == 0) return true;
        while (temp > 0) {
            product *= temp % 10;
            temp /= 10;
        }
        return product % t == 0;
    }
}