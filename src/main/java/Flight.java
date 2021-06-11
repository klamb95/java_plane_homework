import people.CabinCrew;
import people.Passenger;
import people.Pilot;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> passengers;
    private String plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int numberOfSeats;
    private ArrayList<Passenger> checkedInPassengers;

    public Flight( String plane, String flightNumber, String destination, String departureAirport, String departureTime, int numberOfSeats) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrews = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.numberOfSeats = numberOfSeats;
        this.checkedInPassengers = new ArrayList<Passenger>();
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrew> getCabinCrews() {
        return cabinCrews;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfPilolts() {
        return this.pilots.size();
    }

    public int getNumberOfCabinCrew() {
        return this.cabinCrews.size();
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }

    public int getNumberOfCheckedInPassengers(){
        return this.checkedInPassengers.size();



    }

    public void checkInPassengers(ArrayList<Passenger> passengers) {

        if(passengers.size() < this.numberOfSeats){
            checkedInPassengers.addAll(passengers);
        }
    }
}
