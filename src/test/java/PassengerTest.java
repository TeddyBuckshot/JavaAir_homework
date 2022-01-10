import crew.CabinCrew;
import crew.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    CabinCrew crew1;
    CabinCrew crew2;
    CabinCrew crew3;

    @Before
    public void setUp(){
        crew1 = new CabinCrew("Tim", Rank.ATTENDANT);
        crew2 = new CabinCrew("Helen", Rank.OFFICER);
        crew3 = new CabinCrew("Kate", Rank.PURSUER);
    }

    @Test
    public void canRelayMessage(){
        assertEquals("Crew has relayed message to passengers", crew1.relayMessage());
    }

}
