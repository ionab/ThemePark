import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;
    Customer customer;


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

    @Test
    public void customerCanRide(){
        customer = new Customer(12, 180, 50.0);
        assertEquals(true, rollercoaster.checkCanRide(customer));
    }
    @Test
    public void customerTooShort(){
        customer = new Customer(12, 110, 50.00);
        assertEquals(false, rollercoaster.checkCanRide(customer));
    }
    @Test
    public void customerTooPoor(){
        customer = new Customer(12, 180, 00.0);
        assertEquals(false, rollercoaster.checkCanRide(customer));
    }


}
