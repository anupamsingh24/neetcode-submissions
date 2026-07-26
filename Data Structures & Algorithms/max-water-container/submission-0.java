class Solution {
    public int maxArea(int[] heights) {
        int maxVolume = 0;
        int left = 0, right = heights.length - 1;

        while (left < right) {
            maxVolume = Math.max(maxVolume, (right - left) * Math.min(heights[left], heights[right]));

            if (heights[left] < heights[right]) left++;
            else right--;
        }
        return maxVolume;
        
    }
}
