class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }

        list.add(maxElement);

        for (int i = k; i < nums.length; i++) {
            if (maxElement < nums[i]) {
                maxElement = nums[i];
            } 
            list.add(maxElement);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }        
        return result;
    }
}
