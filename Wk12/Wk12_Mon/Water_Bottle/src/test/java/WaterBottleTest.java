import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle = new WaterBottle();

    @Test
    public void testWater() {
        waterBottle.water();
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
        waterBottle.full();
        assertEquals(100, waterBottle.getVolume());
    }
}