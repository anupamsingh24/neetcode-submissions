class Solution {
    public int removeElement(int[] nums, int val) {

        int curr = 0;
        int j = 0;

        for(;j<nums.length; j++) {
            if (nums[j] != val) {
                nums[curr++] = nums[j];
            }
        }

        return curr;
        
    }
}