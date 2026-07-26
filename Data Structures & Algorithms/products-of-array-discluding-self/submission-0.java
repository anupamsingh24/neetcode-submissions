class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];

        Arrays.fill(leftProduct, 1);
        Arrays.fill(rightProduct, 1);

        leftProduct[0] = nums[0];
        rightProduct[nums.length - 1] = nums[nums.length -1];

        for(int i =1; i < nums.length; i++) {
            leftProduct[i] = nums[i] * leftProduct[i-1];
        }

        for(int i = nums.length -2; i>=0; i--) {
            rightProduct[i] = nums[i] * rightProduct[i+1];
        }

        int[] result = new int[nums.length];
        result[0] = rightProduct[1];
        result[nums.length-1] = leftProduct[nums.length - 2];

        for(int i = 1; i <= nums.length -2; i++) {
            result[i] = leftProduct[i-1] * rightProduct[i+1];
        }
        return result;
        
    }
}  
