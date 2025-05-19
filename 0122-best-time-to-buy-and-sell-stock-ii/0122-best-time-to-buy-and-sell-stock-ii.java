class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        if (len == 1) return 0;

        int totalProfit = 0;
        int diff = 0;
        int min = prices[0];

        for (int i=1; i<len; i++) {
            if (prices[i] <= min) {
                min = prices[i];
            }
            else if (prices[i] > min) {
                diff = prices[i] - min;
                totalProfit += diff;
                min = prices[i];
            }
        }
        return totalProfit;



        
    }
}