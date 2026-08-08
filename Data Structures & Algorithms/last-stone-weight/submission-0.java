class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int num : stones) {
            pq.add(num);
        }

        while (!pq.isEmpty()) {
            int first = pq.poll();
            int second;
            if (!pq.isEmpty()) {
                second = pq.poll();
            } else {
                return first;
            }

            if (first == second) continue;

            if (second < first) {
                pq.add(first - second);
            } else {
                pq.add(second - first);
            }
        }

        return 0;
        
    }
}
