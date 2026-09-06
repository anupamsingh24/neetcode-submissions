class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int fruit : fruits) {
            map.put(fruit, map.getOrDefault(fruit, 0) + 1);
        }

        if (map.size() <= 2) {
            return map.values().stream().reduce(0, (a, b) -> a + b);
        }

        int maxVal = Integer.MIN_VALUE;
        int nextMax = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> item : map.entrySet()) {
            if (item.getValue() > maxVal) {
                nextMax = maxVal;
                maxVal = item.getValue();
            }
        }

        return maxVal + nextMax;
        
    }
}