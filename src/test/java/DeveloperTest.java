import TechStaff.DatabaseAdmin;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Alex", 777, 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Alex", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(777, developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, developer.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(5000);
        assertEquals(35000, developer.getSalary(), 0);
    }

    @Test
    public void canNotDecreaseSalary(){
        developer.raiseSalary(-5000);
        assertEquals(30000, developer.getSalary(), 0);
    }
    @Test
    public void canPayBonus(){
        double bonus = developer.payBonus();
        assertEquals(300, bonus, 0);
    }
}
