class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0;

        if (nums.length == 1 && nums[0] == 1) return 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                nums[i] = 1 + nums[i-1];
            }
            maxSum = Math.max(maxSum, nums[i]);
        }

        return maxSum;

        
    }
}