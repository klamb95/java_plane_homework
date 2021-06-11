package people;

public class Passenger extends Person {

    private int numberOfBags;

    public Passenger(String name, Rank rank, int numberOfBags) {
        super(name, rank);
        this.numberOfBags = numberOfBags;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
