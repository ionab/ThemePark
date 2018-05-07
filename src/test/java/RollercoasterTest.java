import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;


    @Before
    public void before(){
        rollercoaster = new Rollercoaster(3.50, 120);
    }

    @Test
    public void canGetPrice(){
        assertEquals(3.50, rollercoaster.getPrice(), 0.01);
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(120, rollercoaster.getMin_height());
    }
}
