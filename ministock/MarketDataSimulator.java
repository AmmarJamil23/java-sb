public class MarketDataSimulator {

    private TradingEngine engine;

    public MarketDataSimulator(TradingEngine engine) {
        this.engine = engine;
    }

    public void start() {
        double[] prices = {100.5, 101.2, 99.8, 102.1};

        for (double price : prices) {
            engine.onMarketPrice(price);
        }
    }
    
}
