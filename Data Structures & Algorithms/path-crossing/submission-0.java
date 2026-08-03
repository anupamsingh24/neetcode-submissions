class Solution {
    public boolean isPathCrossing(String path) {

        Map<Character, Pair<Integer, Integer>> map = new HashMap<>();

        map.put('N', new Pair<>(0, 1));
        map.put('S', new Pair<>(0, -1));
        map.put('E', new Pair<>(1, 0));
        map.put('W', new Pair<>(-1, 0));

        int[][] visit = new int[10000][10000];

        int x = 0;
        int y = 0;
        visit[x][y] = 1;

        for (int i = 0;i < path.length(); i++) {
            x += map.get(path.charAt(i)).getKey();
            y += map.get(path.charAt(i)).getValue();
            if (visit[x][y] == 1) return true;
            visit[x][y] = 1;
        }

        return false;
    }
}