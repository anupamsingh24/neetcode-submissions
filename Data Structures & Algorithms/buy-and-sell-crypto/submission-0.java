class Solution {
    public int maxProfit(int[] prices) {
        int leftInflection = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length - 1; i++) {
            if (prices[i] < prices[i-1] && prices[i+1] > prices[i]) {
                leftInflection = i;
                break;
            }
        }

        int rightInflection = Integer.MIN_VALUE;
        for (int i = prices.length - 2; i>=1; i--) {
            if (prices[i] > prices[i+1] && prices[i] > prices[i-1]) {
                rightInflection = i;
                break;
            }
        }

        if (leftInflection == Integer.MIN_VALUE || rightInflection == Integer.MIN_VALUE) {
            return 0;
        }

        return prices[rightInflection] - prices[leftInflection];
        
    }
}
