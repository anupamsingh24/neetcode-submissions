class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int actualSum = 0;
        for (int num : nums) actualSum += num;

        int nSum = (nums.length * (nums.length + 1)) / 2;


        for (int i = 0 ; i < nums.length; i++) {
            if (i + 1 != nums[i]) return new int[]{actualSum - (nSum - (i+1)), i+1};
        }
        return new int[]{-1};
    }
}