import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Emil", 999, 50000, "Innovation");
    }

    @Test
    public void hasName(){
        assertEquals("Emil", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(999, manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, manager.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Innovation", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000);
        assertEquals(55000, manager.getSalary(), 0);
    }

    @Test
    public void canNotDecreaseSalary(){
        manager.raiseSalary(-5000);
        assertEquals(50000, manager.getSalary(), 0);
    }


    @Test
    public void canPayBonus(){
        double bonus = manager.payBonus();
        assertEquals(500, bonus, 0);
    }

    @Test
    public void canSetName(){
        manager.setName("Robbie");
        assertEquals("Robbie", manager.getName());
    }

    @Test
    public void nameDoesNotChangeIfNull(){
        manager.setName(null);
        assertEquals("Emil", manager.getName());
    }
}
