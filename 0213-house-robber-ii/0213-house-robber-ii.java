class Solution {
    public int robber(int[] nums, int idx, int n, int dp[]) {
            if(idx >= n) {
                return 0;
            }
            if(dp[idx] != -1) return dp[idx];
            int include = nums[idx] + robber(nums, idx+2, n, dp);
            int exclude = robber(nums, idx+1, n, dp);
            return dp[idx] = Math.max(include, exclude);
        }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if(n == 1) return nums[0];
        int dp[] = new int[n];
        int dp1[] = new int[n];
        Arrays.fill(dp , -1);
        Arrays.fill(dp1, -1);
        return Math.max(robber(nums, 0, n-1, dp), robber(nums, 1, n, dp1));
    }
}