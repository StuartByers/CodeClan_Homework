import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle = new WaterBottle();

    @Test
    public void testDrink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void testEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void testFill() {
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}