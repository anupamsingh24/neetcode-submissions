class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int [] val = new int[grid[0].length * grid[0].length + 1];
        Arrays.fill(val, 1);

        for(int i = 0 ; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                val[grid[i][j]]--;
            }
        }

        int[] res = new int[2];

        for (int i =0; i < val.length; i++) {
            if (val[i] == 1) {
                res[1] = i;
            }
            if (val[i] < 0) {
                res[0] = i;
            }
        }
        return res;
        
    }
}