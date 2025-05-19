class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 1) {
            return 0;
        }

        int maxDiff = 0;
        int diff = 0;
        int min = prices[0];

        for (int i=1; i<len; i++) {
            if (min < prices[i]) {
                diff = prices[i] - min;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
            else if (min >= prices[i]) {
                min = prices[i];
            }
        }
        return maxDiff;
        
    }
}