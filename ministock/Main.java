public class Main {

    public static void main(String[] args) {

        MLSignalService mlService = new MLSignalService();

        TradingEngine tradingEngine = new TradingEngine(mlService);

        MarketDataSimulator simulator = new MarketDataSimulator(tradingEngine);

        simulator.start();
    }
    
}
