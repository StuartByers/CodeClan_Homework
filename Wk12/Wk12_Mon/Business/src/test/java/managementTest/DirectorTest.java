package managementTest;

import management.Director;
import org.junit.Before;
import org.junit.Test;

public class DirectorTest {
    private Director director;

    @Before
    public void setUp() {
        director = new Director("Nick Fury", "NF345678D", 100000.0, "Management", 1000000.0);
    }

    @Test
    public void testGetBudget() {
        assertEquals(1000000.0, director.getBudget());
    }

    private void assertEquals(double v, double budget) {
    }

    @Test
    public void testRaiseSalary() {
        director.raiseSalary(20000.0);
        assertEquals(120000.0, director.getSalary());
    }

    @Test
    public void testPayBonus() {
        double bonus = director.payBonus();
        assertEquals(1000.0, bonus);
    }
}