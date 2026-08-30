class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        int fromFront = Math.max(minIndex, maxIndex) + 1;
        int fromBack = n - Math.min(minIndex, maxIndex);
        int oneFrontOneBack =
                Math.min(minIndex, maxIndex) + 1
                + n - Math.max(minIndex, maxIndex);
        return Math.min(
                fromFront,
                Math.min(fromBack, oneFrontOneBack)
        );
    }
}