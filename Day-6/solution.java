class maximumProfit {
    public int MaximumProfit(int prices[]) {
        // code here
        int profit = 0;
        
        for(int i = 1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit = profit+prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}