class RailwayTrack {
    synchronized void useTrack(String trainName) {
        System.out.println(trainName + " is on the railway track.");
        try {
            Thread.sleep(2000); // Simulating the time taken to cross the track
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(trainName + " has crossed the railway track.");
    }
}

class Train extends Thread {
    private String trainName;
    private RailwayTrack track;

    public Train(String trainName, RailwayTrack track) {
        this.trainName = trainName;
        this.track = track;
    }

    @Override
    public void run() {
        track.useTrack(trainName);
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        RailwayTrack sharedTrack = new RailwayTrack();

        Train train1 = new Train("Train A", sharedTrack);
        Train train2 = new Train("Train B", sharedTrack);

        train1.start();
        train2.start();
    }
}
