import org.junit.Before;
import org.junit.Test;
import people.Pilot;
import people.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Adam", Rank.CAPTAIN, "TESTY2");

    }

    @Test
    public void canGetName(){
        assertEquals("Adam", pilot.getName());

    }

    @Test
    public void canGetRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetLicense(){
        assertEquals("TESTY2", pilot.getPilotLicense());
    }

    @Test
    public void canFlyPlane(){
        assertEquals("I am flying the plane", pilot.flyPlane());
    }


}
