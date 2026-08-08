public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Set<Integer> arr2Set = new HashSet<>();
        for (int num : arr2) arr2Set.add(num);

        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> end = new ArrayList<>();
        for (int num : arr1) {
            if (!arr2Set.contains(num)) end.add(num);
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        Collections.sort(end);

        List<Integer> res = new ArrayList<>();
        for (int num : arr2) {
            int freq = count.get(num);
            for (int i = 0; i < freq; i++) res.add(num);
        }
        res.addAll(end);

        return res.stream().mapToInt(i -> i).toArray();
    }
}