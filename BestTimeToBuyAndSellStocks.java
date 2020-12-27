public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] stocks = {7, 1, 5, 3, 6, 4};

        // Brute Force Solution
        int profit = 0;
        for (int i = 0; i < stocks.length; i++) {
            int stockPrice = stocks[i];
            for (int j = i+1; j < stocks.length; j++) {
                int newProfit = stocks[j] - stockPrice;
                if(newProfit > profit)
                    profit = newProfit;
            }
        }
        System.out.println("Profit is "+profit);

        // One pass Solution
        profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < stocks.length; i++) {
            if(stocks[i] < minPrice)
                minPrice = stocks[i];
            else if(stocks[i] - minPrice > profit)
                profit = stocks[i] - minPrice;
        }
        System.out.println("Profit is "+profit);
    }
}
