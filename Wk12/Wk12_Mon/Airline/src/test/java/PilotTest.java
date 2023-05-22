import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    private Pilot pilot;

    @Before
    public void setup() {
        pilot = new Pilot("Stuart Byers", "Captain", "12345");
    }

    @Test
    public void testPilotGetName() {
        assertEquals("Stuart Byers", pilot.getName());
    }

    @Test
    public void testPilotGetRank() {
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void testPilotGetLicenseNumber() {
        assertEquals("12345", pilot.getLicenseNumber());
    }

    @Test
    public void testPilotFlyPlane() {
        assertEquals("Up, up and away.", pilot.flyPlane());
    }
}