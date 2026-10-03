class Solution {
    public boolean lemonadeChange(int[] bills) {
        int sum = 0;
        Map<Integer, Integer> change = new HashMap<>();

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) change.put(5, change.getOrDefault(5, 0) + 1);
            else if (bills[i] == 10) {
                if (change.getOrDefault(5, 0) < 1) return false;
                change.put(10, change.getOrDefault(10, 0) + 1);
                change.put(5, change.getOrDefault(5, 0) - 1);
            }
            else if (bills[i] == 20) {
                if (change.getOrDefault(5, 0) < 1 && change.getOrDefault(10, 0) < 1) return false;
                change.put(20, change.getOrDefault(20, 0) + 1);
                change.put(10, change.getOrDefault(10, 0) - 1);
                change.put(5, change.getOrDefault(5, 0) - 1);
            }

        }

        return true;
        
    }
}