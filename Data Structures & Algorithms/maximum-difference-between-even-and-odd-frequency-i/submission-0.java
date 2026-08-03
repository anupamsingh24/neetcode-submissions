class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() % 2 == 0) {
                even.add(item.getValue());
            } else {
                odd.add(item.getValue());
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        return Math.max(Math.abs(even.get(0) - odd.get(odd.size() - 1)),
        Math.abs(even.get(even.size() - 1) - odd.get(0)));
        
    }
}