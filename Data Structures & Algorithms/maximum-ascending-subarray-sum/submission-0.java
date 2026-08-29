class Solution {
    public int maxAscendingSum(int[] nums) {

        int[] clone = nums.clone();

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                clone[i] += clone[i-1];
            }
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = Math.max(result, clone[i]);
        }

        return result;
    }
}