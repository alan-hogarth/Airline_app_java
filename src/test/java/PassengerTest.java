import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Carlos", 1);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Carlos", passenger.getName());
    }

    @Test
    public void passengerHasBag(){

        assertEquals(1, passenger.getBags());
    }

    @Test
    public void canSetBags(){
        assertEquals(1, passenger.setBags(1));
    }
}
