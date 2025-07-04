package java;

/* 
* N = number of prices
* ---
* Time complexity: O(N)
* Space complexity: O(1) 新しく配列を作っていないため
*/

class Solution{
    public int maxProfit(int[] prices){
        int maxP = 0;
        int minBuy = prices[0];

        for (int sell :prices){
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }

        return maxP;
    }
}