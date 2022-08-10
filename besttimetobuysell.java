class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,maxPrice=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i]-min>maxPrice){
                maxPrice=prices[i]-min;
            }
        }
        return maxPrice;
    }
}
