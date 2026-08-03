class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                nums[i] = 1 + nums[i-1];
            }
            maxSum = Math.max(maxSum, nums[i]);
        }

        return maxSum;

        
    }
}