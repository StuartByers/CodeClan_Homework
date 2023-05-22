package managementTest;

import management.Manager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Steve Rogers", "SR987654C", 70000.0, "Engineering");
    }

    @Test
    public void testGetDeptName() {
        assertEquals("Engineering", manager.getDeptName());
    }

    @Test
    public void testRaiseSalary() {
        manager.raiseSalary(10000.0);
        assertEquals(80000.0, manager.getSalary());
    }

    @Test
    public void testPayBonus() {
        double bonus = manager.payBonus();
        assertEquals(700.0, bonus);
    }
}