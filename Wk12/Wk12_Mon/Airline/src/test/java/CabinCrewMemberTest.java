import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    private CabinCrewMember crewMember;

    @Before
    public void setup() {
        crewMember = new CabinCrewMember("Jean Byers", "Flight Attendant");
    }

    @Test
    public void testCabinCrewMemberGetName() {
        assertEquals("Jean Byers", crewMember.getName());
    }

    @Test
    public void testCabinCrewMemberGetRank() {
        assertEquals("Flight Attendant", crewMember.getRank());
    }

    @Test
    public void testCabinCrewMemberRelayMessage() {
        assertEquals("Please fasten your seatbelts.", crewMember.relayMessage());
    }
}