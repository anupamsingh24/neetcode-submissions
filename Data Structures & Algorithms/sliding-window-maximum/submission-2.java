class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int l = 0, r = k-1;
        list.add(findMaxInRange(l, r, nums));

        for (int i = k; i < nums.length; i++) {
            list.add(findMaxInRange(++l, i, nums));
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
        
    }

    private int findMaxInRange(int l, int r, int[] nums) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = l; i <=r; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }
}
