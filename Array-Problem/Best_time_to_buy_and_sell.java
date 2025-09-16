// Best time to Buy and Sell stock

public class Best_time_to_buy_and_sell {
    public static void main(String[] args) {
        
        int prices[] = {7,1,5,6,3,4};

        int maxprofit = 0;  // sell
        int bestBuy = prices[0];

        for(int i=0 ; i<prices.length ; i++){
            if(prices[i] > bestBuy){
                maxprofit = Integer.max(maxprofit , prices[i]-bestBuy);  // sell 
            }
            bestBuy = Integer.min(bestBuy, prices[i]);
        }

        System.out.println("Best Time to Buy Stock When prices is Minimum =  " + bestBuy);
        System.out.println("Best Time to sell Stock When profit is more =  " + maxprofit);

    }
}
