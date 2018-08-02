import Management.Manager;
import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin dbadmin;

    @Before
    public void before(){
        dbadmin = new DatabaseAdmin("Robbie", 888, 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Robbie", dbadmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(888, dbadmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, dbadmin.getSalary(), 0);
    }

    @Test
    public void canRaiseSalary(){
        dbadmin.raiseSalary(5000);
        assertEquals(35000, dbadmin.getSalary(), 0);
    }

    @Test
    public void canNotDecreaseSalary(){
        dbadmin.raiseSalary(-5000);
        assertEquals(30000, dbadmin.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        double bonus = dbadmin.payBonus();
        assertEquals(300, bonus, 0);
    }
}
