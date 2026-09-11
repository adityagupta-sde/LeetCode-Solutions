class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        for (int digit : digits) {
            freq[digit]++;
        }

        int count = 0;

        for (int num = 100; num <= 998; num++) {
            if (num % 2 != 0) {
                continue;
            }
            int[] required = new int[10];
            int temp = num;
            while (temp > 0) {
                required[temp % 10]++;
                temp /= 10;
            }
            boolean possible = true;
            for (int digit = 0; digit < 10; digit++) {
                if (required[digit] > freq[digit]) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                count++;
            }
        }
        return count;
    }
}