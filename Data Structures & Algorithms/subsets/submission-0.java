class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subsetsAll(nums, res, list, 0);
        return res;
        
    }

    private void subsetsAll(int[] nums, List<List<Integer>> res, List<Integer> list, int index) {

        if (index == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[index]);
        subsetsAll(nums, res, list, index + 1);
        list.remove(list.size() - 1);
        subsetsAll(nums, res, list, index + 1);
    }
}
