class Solution {
    public int longestConsecutive(int[] nums) {

        int[] lcs = new int[nums.length];
        Arrays.fill(lcs, 0);
        Integer result = 0;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                lcs[i] = 1 + lcs[i-1];
                result = Math.max(result, lcs[i]);
            }
        }

        return result + 1;
        
    }
}
