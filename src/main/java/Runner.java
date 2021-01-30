public class Runner {

    public static void main(String[] args) {
        Plane plane = new Plane(PlaneType.BOEING747);
        Flight flight = new Flight(plane, "EZ234", "New Orleans",
                "Glasgow", "9am");
        Passenger passenger = new Passenger("Carlos", 1, 1, flight);

        //test random seat generator
        flight.addPassenger(passenger);
        System.out.println(passenger.getSeatNo());


    }


}
