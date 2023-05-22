import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PlaneTest {
    private Plane plane;

    @Before
    public void setup() {
        plane = new Plane("BOEING747", 200, 10000);
    }

    @Test
    public void testPlaneGetPlaneType() {
        assertEquals("BOEING747", plane.getPlaneType());
    }

    @Test
    public void testPlaneGetCapacity() {
        assertEquals(200, plane.getCapacity());
    }

    @Test
    public void testPlaneGetTotalWeight() {
        assertEquals(10000, plane.getTotalWeight());
    }

    @Test
    public void testPlaneGetAvailableSeats() {
        assertEquals(200, plane.getAvailableSeats());
    }

    @Test
    public void testPlaneBookPassenger() {
        Passenger passenger = new Passenger("John Smith", 2);
        plane.bookPassenger(passenger);
        assertEquals(199, plane.getAvailableSeats());
    }

    @Test
    public void testPlaneBookPassengerNoAvailableSeats() {
        for (int i = 0; i < 200; i++) {
            Passenger passenger = new Passenger("Passenger" + (i + 1), 1);
            plane.bookPassenger(passenger);
        }

        Passenger extraPassenger = new Passenger("Extra Passenger", 1);
        boolean booked = plane.bookPassenger(extraPassenger);
        assertFalse(booked);
        assertEquals(0, plane.getAvailableSeats());
    }
}