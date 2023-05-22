import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger;

    @Before
    public void setup() {
        passenger = new Passenger("Amy Byers", 2);
    }

    @Test
    public void testPassengerGetName() {
        assertEquals("Amy Byers", passenger.getName());
    }

    @Test
    public void testPassengerGetNumBags() {
        assertEquals(2, passenger.getNumBags());
    }
}