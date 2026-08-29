public class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = {0, 1};
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                res[0] = nums[i];
            } else if (nums[i] - nums[i - 1] == 2) {
                res[1] = nums[i] - 1;
            }
        }

        if (nums[nums.length - 1] != nums.length) {
            res[1] = nums.length;
        }
        return res;
    }
}