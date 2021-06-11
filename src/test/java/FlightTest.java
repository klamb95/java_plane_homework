import org.junit.Before;
import org.junit.Test;
import people.Passenger;
import people.Rank;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before(){
        flight = new Flight("Airbus", "EDI786", "LDN", "EDI", "20:00", 3);
        passenger1 = new Passenger("Kieran ", Rank.PASSENGER, 2);
        passenger2 = new Passenger("Gwen", Rank.PASSENGER, 1);

    }

    @Test
    public void pioltsStartEmpty(){
        assertEquals(0, flight.getNumberOfPilolts());
    }

    @Test
    public void cabinCrewStartEmpty(){
        assertEquals(0, flight.getNumberOfCabinCrew());
    }

    @Test
    public void passengersStartEmpty(){
        assertEquals(0, flight.getNumberOfPassengers());
    }

    @Test
    public void hasAPlane(){
        assertEquals("Airbus", flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("EDI786", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("LDN", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("20:00", flight.getDepartureTime());
    }

    @Test
    public void hasSeats(){
        assertEquals(3, flight.getNumberOfSeats());
    }

    @Test
    public void checkedInPassengersStartsEmpty(){
        assertEquals(0, flight.getNumberOfCheckedInPassengers());
    }

    @Test
    public void canCheckInPassenger(){
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        flight.checkInPassengers(passengers);
        assertEquals(2, flight.getNumberOfCheckedInPassengers());
    }

    @Test
    public void canNotCheckInPassengers(){
        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger2);
        flight.checkInPassengers(passengers);
        assertEquals(0, flight.getNumberOfCheckedInPassengers());
    }





}
