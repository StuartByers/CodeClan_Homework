package techStaffTest;

import org.junit.Before;
import org.junit.Test;

import techStaff.DatabaseAdmin;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin dbAdmin;

    @Before
    public void setUp() {
        dbAdmin = new DatabaseAdmin("Bruce Banner", "BB987654B", 60000.0);
    }

    @Test
    public void testRaiseSalary() {
        dbAdmin.raiseSalary(5000.0);
        assertEquals(65000.0, dbAdmin.getSalary());
    }

    @Test
    public void testPayBonus() {
        double bonus = dbAdmin.payBonus();
        assertEquals(600.0, bonus);
    }
}
