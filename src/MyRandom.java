import java.util.Random;

public class MyRandom {
    private int randomInt;
    private double randomDouble;

    private static Random rnd = new Random();

    public int getRandomInt() {
        return rnd.nextInt();
    }

    public int getRandomInt(int bound) {
        return rnd.nextInt(bound);
    }

    public double getRandomDouble() {
        return rnd.nextDouble();
    }
}
