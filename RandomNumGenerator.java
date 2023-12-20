import java.util.Random;

class RandomNumberGenerator extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int randomInt = new Random().nextInt(100);
            System.out.println("Generated Random Number: " + randomInt);

            if (randomInt % 2 == 0) {
                SquareCalculator squareCalculator = new SquareCalculator(randomInt);
                squareCalculator.start();
            } else {
                CubeCalculator cubeCalculator = new CubeCalculator(randomInt);
                cubeCalculator.start();
            }
        }
    }
}

class SquareCalculator extends Thread {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("Square: " + square);
    }
}

class CubeCalculator extends Thread {
    private int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("Cube: " + cube);
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        randomNumberGenerator.start();
    }
}
