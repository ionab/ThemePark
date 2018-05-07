import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    Rollercoaster rollercoaster;


    @Before
    public void before(){
        customer = new Customer(25, 165, 40.00);
    }

    @Test
    public void canGetAge(){
        assertEquals(25, customer.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(165, customer.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(40.0, customer.getMoney(), 0.01);
    }

    @Test
    public void canPayMoney(){
        rollercoaster = new Rollercoaster(7.00, 165);
        customer.payforRide(rollercoaster);
        assertEquals(33.00, customer.getMoney(), 0.01);
    }

}
