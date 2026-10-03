class Solution {
    public boolean lemonadeChange(int[] bills) {
        int sum = 0;

        for (int i = 0; i < bills.length; i++) {
            sum += 5;
            if (sum < bills[i] - 5) return false;
        }

        return true;
        
    }
}