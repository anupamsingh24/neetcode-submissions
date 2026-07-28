class NumArray {

    List<Integer> sums;

    public NumArray(int[] nums) {
        sums = new ArrayList<>(nums.length);

        sums.add(nums[0]);
        for(int i = 1; i< nums.length; i++) {
            sums.add(sums.get(i-1) + nums[i]);
        }
        
    }
    
    public int sumRange(int left, int right) {
        if (left == 0) return sums.get(right);
        return sums.get(right) - sums.get(left-1);
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */