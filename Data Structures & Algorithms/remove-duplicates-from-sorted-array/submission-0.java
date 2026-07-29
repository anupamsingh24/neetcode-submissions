class Solution {
    public int removeDuplicates(int[] nums) {
        int sorted = 1;
        int j = 1;
        for (; j < nums.length; j++) {
            if (nums[j] != nums[j-1]) {
                nums[sorted++] = nums[j];
            }
        }

        return sorted;
        
    }
}