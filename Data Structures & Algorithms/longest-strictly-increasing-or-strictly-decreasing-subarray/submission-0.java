class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int[] lis = new int[nums.length];
        Arrays.fill(lis, 1);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) lis[i] += lis[i-1];
        }

        int[] dis = new int[nums.length];
        Arrays.fill(dis, 1);

        for(int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) lis[i] += lis[i-1];
        }

        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            result = Math.max(lis[i], dis[i]);
        }

        return result;
    }
}