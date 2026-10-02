class Solution {
    public int[] runningSum(int[] nums) {
        int leftSum = 0;
        for(int i=0; i<nums.length; i++) {
            nums[i] += leftSum;
            leftSum = nums[i];
        }
        return nums;
    }
}