class MaxProfit {
    public int maximumProfit(int prices[]) {
        // Code here
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int price : prices){
            
            if(price <minPrice){
                minPrice = price;
            }else {
                int profit = price-minPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
}