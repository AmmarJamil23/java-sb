import java.util.Random;

public class MLSignalService {
    private Random random = new Random();

    public double getBuyProbability(double price) {
        double probability = random.nextDouble();
        System.out.println("ML Service probability = " + probability);
        return probability;

    }

}