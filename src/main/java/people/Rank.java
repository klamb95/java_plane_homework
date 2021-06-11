package people;

public enum Rank {

    CAPTAIN("captain"),
    FIRST_OFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHT_ATTENDANT("Flight Attended"),
    PASSENGER("Passenger");

    private final String rank;

    Rank(String rank){
        this.rank = rank;
    }

    public String getRank(){
        return this.rank;
    }
}