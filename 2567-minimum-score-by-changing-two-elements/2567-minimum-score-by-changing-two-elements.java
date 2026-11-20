class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int num1 = nums[n - 1] - nums[2];
        int num2 = nums[n - 2] - nums[1];
        int num3 = nums[n - 3] - nums[0];
        
        return Math.min(num1, Math.min(num2, num3));
    }
}