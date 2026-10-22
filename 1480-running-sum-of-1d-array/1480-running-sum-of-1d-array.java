class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n + 1];   
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i + 1];
        }
        return result;
    }
}