class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] copy = nums.clone();
        Arrays.sort(copy);

        for (int i = 0 ; i < nums.length; i++) {
            if (i + 1 != copy[i]) return new int[]{nums[i], i+1};
        }
        return new int[]{-1};
    }
}