class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0 ; i < nums.length; i++) {
            if (i + 1 != nums[i]) return new int[]{nums[i], i+1};
        }
        return new int[]{-1};
    }
}