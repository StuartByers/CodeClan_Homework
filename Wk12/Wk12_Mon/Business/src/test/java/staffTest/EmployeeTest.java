package staffTest;

import org.junit.Before;
import org.junit.Test;

import staff.Employee;
import techStaff.Developer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void setUp() {
        employee = new Developer("Tony Stark", "TS123456A", 50000.0);
    }

    @Test
    public void testGetters() {
        assertEquals("Tony Stark", employee.getName());
        assertEquals("TS123456A", employee.getNiNumber());
        assertEquals(50000.0, employee.getSalary());
    }

    @Test
    public void testRaiseSalary() {
        employee.raiseSalary(10000.0);
        assertEquals(60000.0, employee.getSalary());
    }

    @Test
    public void testPayBonus() {
        double bonus = employee.payBonus();
        assertEquals(500.0, bonus);
    }
}
