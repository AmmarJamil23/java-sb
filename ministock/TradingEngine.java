public class TradingEngine {

    private MLSignalService mlService;

    public TradingEngine(MLSignalService mlService) {
        this.mlService = mlService;
    }

    public void onMarketPrice(double price) {
        System.out.println("Received market price = " + price);

        double probability = mlService.getBuyProbability(price);

        if (probability > 0.7) {
            executeBuy(price);
        }
        else {
            System.out.println("Decision = NO  TRADE");
        }
    }

    private void executeBuy(double price) {
        System.out.println("Decision = BUY at price " + price);
    }
    
}
