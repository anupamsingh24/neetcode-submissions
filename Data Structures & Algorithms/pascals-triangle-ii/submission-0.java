class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> res = new ArrayList<>();

        res.add(Arrays.asList(1));
        res.add(Arrays.asList(1, 1));

        for (int i = 2; i<= rowIndex; i++) {
            List<Integer> vals = res.get(i-1);
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j <= vals.size() - 1; j++) {
                temp.add(vals.get(j) + vals.get(j-1));
            }
            temp.add(1);
            res.add(temp);
        }

        return res.get(rowIndex);
        
    }
}