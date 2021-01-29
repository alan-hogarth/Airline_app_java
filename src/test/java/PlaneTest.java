import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Flight flight;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("Clive", 1);
        passenger1 = new Passenger("Zelda",2);
        flight = new Flight(plane, "EZ234", "New Orleans",
                "Glasgow", "9am");
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(5, plane.getPlaneCapacity());
    }


    @Test
    public void planeHasWeight(){
        assertEquals(120, plane.getPlaneWeight());

    }
}
