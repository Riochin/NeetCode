class Solution {
    public int maxProfit(int[] prices) {
        int maxDif = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
               if(prices[j] - prices[i]  > maxDif){
                maxDif = prices[j] - prices[i];
               } 
            }
        }
        return maxDif;
    }
}
