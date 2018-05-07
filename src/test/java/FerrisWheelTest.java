import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FerrisWheelTest {
    FerrisWheel ferrisWheel;

    @Before
    public void before(){
        ferrisWheel = new FerrisWheel(3.50, 120);
    }

    @Test
    public void canGetPrice(){
        assertEquals(3.50, ferrisWheel.getPrice(), 0.01);
    }
    @Test
    public void canGetMinHeight(){
        assertEquals(120, ferrisWheel.getMin_height());
    }

}
