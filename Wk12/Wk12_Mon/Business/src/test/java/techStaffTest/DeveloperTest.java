package techStaffTest;

import org.junit.Before;
import org.junit.Test;

import techStaff.Developer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Tony Stark", "TS123456A", 50000.0);
    }

    @Test
    public void testRaiseSalary() {
        developer.raiseSalary(10000.0);
        assertEquals(60000.0, developer.getSalary());
    }

    @Test
    public void testPayBonus() {
        double bonus = developer.payBonus();
        assertEquals(500.0, bonus);
    }
}