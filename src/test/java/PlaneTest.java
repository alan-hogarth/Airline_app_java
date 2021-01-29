import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(10, plane.getPlaneCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(10, plane.getPlaneWeight());

    }
}
