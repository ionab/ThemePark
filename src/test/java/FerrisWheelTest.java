import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FerrisWheelTest {
    FerrisWheel ferrisWheel;
    Customer customer;

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

    @Test
    public void customerCanRide(){
        customer = new Customer(12, 180, 50.0);
        assertEquals(true, ferrisWheel.checkCanRide(customer));
    }
    @Test
    public void customerTooShort(){
        customer = new Customer(12, 110, 50.00);
        assertEquals(false, ferrisWheel.checkCanRide(customer));
    }
    @Test
    public void customerTooPoor(){
        customer = new Customer(12, 180, 00.0);
        assertEquals(false, ferrisWheel.checkCanRide(customer));
    }

}
