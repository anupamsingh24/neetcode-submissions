class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for(int i =0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] node : edges) {
            int u = node[0];
            int v = node[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adj, visited, i);
                res++;
            }
        }

        return res;

    }

    private void dfs(List<List<Integer>> adj, boolean[] visited, int node) {
        if (visited[node]) return;

        visited[node] = true;

        for (int ele : adj.get(node)) {
            dfs(adj, visited, ele);
        }
    }
}
