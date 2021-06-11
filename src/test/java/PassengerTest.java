import org.junit.Before;
import org.junit.Test;
import people.Passenger;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Brad", Rank.PASSENGER, 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Brad", passenger.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.PASSENGER, passenger.getRank());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
