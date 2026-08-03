class Solution {
    public int findJudge(int n, int[][] trust) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < trust.length; i++) {
            for (int j = 0; j < trust[0].length; j++) {
                set.add(trust[i][j]);
            }
        }

        if (set.size() > 1) return -1;
        return set[0];
        
    }
}