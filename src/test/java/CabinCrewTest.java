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
}
