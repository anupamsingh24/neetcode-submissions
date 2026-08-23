class Solution {
    Set<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>());
        return new ArrayList<>(res);
    }

    private void backtrack(int i, int[] nums, List<Integer> list) {
        if (i == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        backtrack(i+1, nums, list);
        list.remove(list.size() - 1);
        backtrack(i+1, nums, list);
    }
}
