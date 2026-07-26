class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }

        ArrayList<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            result.add(new int[]{item.getKey(), item.getValue()});
        }

        Collections.sort(result, (a, b) -> b[1] - a[1]);

        for(int[] i : result) System.out.println(i[0] + " " + i[1]);

        int[] kMostElements = new int[k];
        for(int i =0; i < k; i++) {
            kMostElements[i] = result.get(i)[0];
        }
        return kMostElements;
        
    }
}
