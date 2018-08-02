import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Melinda", 555, 60000, "Sales", 100000);
    }

    @Test
    public void hasName(){
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals(555, director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, director.getSalary(), 0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(65000, director.getSalary(), 0);
    }

    @Test
    public void canNotDecreaseSalary(){
        director.raiseSalary(-5000);
        assertEquals(60000, director.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        double bonus = director.payBonus();
        assertEquals(1200, bonus, 0);
    }

    @Test
    public void hasBudget(){
        assertEquals(100000, director.getBudget(), 0);
    }
}
