import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FlightTest {
    private Flight flight;

    @Before
    public void setup() {
        List<Pilot> pilots = new ArrayList<>();
        List<CabinCrewMember> crewMembers = new ArrayList<>();
        Plane plane = new Plane("BOEING747", 200, 10000);
        flight = new Flight(pilots, crewMembers, plane, "FR756", "GLA", "EDI", "10:00");
    }

    @Test
    public void testFlightGetAvailableSeats() {
        assertEquals(200, flight.getAvailableSeats());
    }

    @Test
    public void testFlightBookPassenger() {
        Passenger passenger = new Passenger("James Byers", 2);
        assertTrue(flight.bookPassenger(passenger));
        assertEquals(199, flight.getAvailableSeats());
    }

    @Test
    public void testFlightBookPassengerNoAvailableSeats() {
        for (int i = 0; i < 200; i++) {
            Passenger passenger = new Passenger("Passenger" + (i + 1), 1);
            assertTrue(flight.bookPassenger(passenger));
        }

        Passenger extraPassenger = new Passenger("Extra Passenger", 1);
        assertFalse(flight.bookPassenger(extraPassenger));
        assertEquals(0, flight.getAvailableSeats());
    }
}