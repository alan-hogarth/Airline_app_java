public class Plane {

    private PlaneType plane;


    public Plane(PlaneType plane){
        this.plane = plane;

    }


    public PlaneType getPlaneType() {
        return this.plane;
    }


    public int getPlaneCapacity() {
        return this.plane.getCapacity();
    }

    public int getPlaneWeight() {
        return this.plane.getWeight();
    }

}
