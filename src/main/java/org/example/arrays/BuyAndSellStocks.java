package org.example.arrays;

public class BuyAndSellStocks {

    public static void main(String[] args) {
      int []arr= {7, 1, 5, 3, 6,  4};
         int i = buyAndSellStock(arr);
        System.out.println("max profit :"+i);
    }
    public static int buyAndSellStock(int [] prices){
        int buyingPrize=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyingPrize < prices[i]){
                int profit =prices[i]-buyingPrize;
                maxProfit=Math.max(profit,maxProfit);
            }else {
                buyingPrize=prices[i];
            }
        }
        return maxProfit;
    }
}
