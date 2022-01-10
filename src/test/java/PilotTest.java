import crew.Pilot;
import crew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;

    @Before
    public void setUp(){
        pilot1 = new Pilot("Linzi", Rank.CAPTAIN, "PL346");
    }

    @Test
    public void canFly(){
        assertEquals("The Pilot flies the plane", pilot1.flyPlane());
    }
}
