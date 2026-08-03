class Solution {
    public int findJudge(int n, int[][] trust) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < trust.length; i++) {
            set.add(trust[i][1]);
        }

        if (set.size() > 1) return -1;
        return set.stream().findFirst().get();
        
    }
}