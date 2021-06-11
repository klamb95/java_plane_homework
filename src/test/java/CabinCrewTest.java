import org.junit.Before;
import org.junit.Test;
import people.CabinCrew;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before(){
    cabinCrew = new CabinCrew("Kieran", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetName(){
        assertEquals("Kieran", cabinCrew.getName());
    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew.getRank());
    }

    @Test
    public void canGiveInstructions(){
        assertEquals("Please leave your try in the upright position", cabinCrew.giveTakeOffInstructions());
    }
}
