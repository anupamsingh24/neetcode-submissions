class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));

        if (numRows == 1) {
            return res;
        }

        res.add(Arrays.asList(1, 1));

        if (numRows == 2) {
            return res;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> prev = res.get(i-1);
            List<Integer> result = new ArrayList<>();
            result.add(1);
            for (int j = 1; j < prev.size(); j++) {
                result.add(prev.get(j) + prev.get(j-1));
            }
            result.add(1);
            res.add(result);
        }

        return res;
        
    }
}