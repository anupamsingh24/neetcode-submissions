class Solution {
    public void moveZeroes(int[] nums) {
        int curr = 0;
        int nonZero = 0;

        for (;nonZero < nums.length; nonZero++) {
            if (nums[nonZero] != 0) {
                nums[curr++] = nums[nonZero];
            }
        }

        for (;curr < nums.length; curr++) nums[curr] = 0;
    
    }
}