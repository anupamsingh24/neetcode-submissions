class Solution {
    public int pivotIndex(int[] nums) {
        
        int[] leftPivot = new int[nums.length];
        int[] rightPivot = new int[nums.length];

        leftPivot[0] = 0;
        rightPivot[nums.length - 1] = 0;

        for (int i = 1; i < nums.length; i++) {
            leftPivot[i] = nums[i-1] + leftPivot[i-1];
        }

        for (int i = nums.length -2; i >=0; i--) {
            rightPivot[i] = nums[i+1] + rightPivot[i+1];
        }

        int ans = -1;
        for (int i =0 ; i<nums.length; i++) {
            if (leftPivot[i] == rightPivot[i]){
                ans = i;
                break;
            }
        }
        return ans;
    }
}