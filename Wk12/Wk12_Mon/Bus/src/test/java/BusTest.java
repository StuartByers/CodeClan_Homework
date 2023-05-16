import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BusTest {
    private Bus bus;
    private Person person1;
    private Person person2;
    private Person person3;

    @Before
    public void setUp() {
        bus = new Bus("Edinburgh", 2);
        person1 = new Person("Lyra");
        person2 = new Person("Stuart");
        person3 = new Person("Iona");
    }

    @Test
    public void testGetNumberOfPassengers() {
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void testAddPassenger() {
        assertTrue(bus.addPassenger(person1));
        assertEquals(1, bus.getNumberOfPassengers());

        assertTrue(bus.addPassenger(person2));
        assertEquals(2, bus.getNumberOfPassengers());

        assertFalse(bus.addPassenger(person3));
        assertEquals(2, bus.getNumberOfPassengers());
    }

    @Test
    public void testRemovePassenger() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);

        assertTrue(bus.removePassenger(person1));
        assertEquals(1, bus.getNumberOfPassengers());

        assertFalse(bus.removePassenger(person1));
        assertEquals(1, bus.getNumberOfPassengers());
    }
}
