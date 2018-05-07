import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {
    Dodgem dodgem;
    Customer customer;


    @Before
    public void before(){
        dodgem = new Dodgem(3.50, 120);
    }

    @Test
    public void canGetPrice(){
        assertEquals(3.50, dodgem.getPrice(), 0.01);
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(120, dodgem.getMin_height());
    }
    @Test
    public void customerCanRide(){
        customer = new Customer(12, 180, 50.0);
        assertEquals(true, dodgem.checkCanRide(customer));
    }
    @Test
    public void customerTooShort(){
        customer = new Customer(12, 110, 50.00);
        assertEquals(false, dodgem.checkCanRide(customer));
    }


}
