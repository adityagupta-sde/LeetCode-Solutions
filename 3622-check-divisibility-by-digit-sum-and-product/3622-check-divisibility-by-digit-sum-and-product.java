class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int digSum = 0;
        int digPro = 1;
        while (temp > 0) {
            int digit = temp % 10;
            digSum += digit;
            digPro *= digit;
            temp /= 10;
        }
        int res = digSum + digPro;
        return n % res == 0;
    }
}