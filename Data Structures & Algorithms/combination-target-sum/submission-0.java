class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {


        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        subsetAll(nums, res, subset, 0, target);
        return res;
    }

    private void subsetAll(int[] nums, List<List<Integer>> res, List<Integer> subset, int index, int target) {

        if (target == 0) {
            res.add(new ArrayList<>(subset));
            return;
        }

        if (target < 0 || index  >= nums.length) {
            return;
        }

        subset.add(nums[index]);
        subsetAll(nums, res, subset, index, target - nums[index]);
        subset.remove(subset.size() - 1);
        subsetAll(nums, res, subset, index+1, target);

    }
}
