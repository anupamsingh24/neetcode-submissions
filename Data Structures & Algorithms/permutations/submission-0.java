class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private void backtrack(List<Integer> perms, int[] nums, boolean[] pick) {
        if (perms.size() == nums.length) {
            res.add(new ArrayList<>(perms));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!pick[i]) {
                perms.add(nums[i]);
                pick[i] = true;
                backtrack(perms, nums, pick);
                perms.remove(perms.size() - 1);
                pick[i] = false;
            }
        }
    }
}
