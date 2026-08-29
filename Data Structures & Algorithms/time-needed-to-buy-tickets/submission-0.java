public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i);
        }

        int time = 0;
        while (!queue.isEmpty()) {
            time++;
            int cur = queue.poll();
            tickets[cur]--;
            if (tickets[cur] == 0) {
                if (cur == k) {
                    return time;
                }
            } else {
                queue.add(cur);
            }
        }
        return time;
    }
}