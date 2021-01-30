public class Runner {

    public static void main(String[] args) {

        Plane plane = new Plane(PlaneType.BOEING747);
        Flight flight = new Flight(plane, "EZ234", "New Orleans",
                "Glasgow", "9am");
        Passenger passenger1 = new Passenger("Carlos", 1, 1, flight);
        Passenger passenger2 = new Passenger("Kang", 1, 1, flight);
        Passenger passenger3 = new Passenger("Kang", 1, 1, flight);
        Passenger passenger4 = new Passenger("Kang", 1, 1, flight);
        Passenger passenger5 = new Passenger("Kang", 1, 1, flight);
        Passenger passenger6 = new Passenger("Kang", 1, 1, flight);

        //test random seat generator
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);

        System.out.println(passenger1.getSeatNo());
        System.out.println(passenger2.getSeatNo());
        System.out.println(passenger3.getSeatNo());
        System.out.println(passenger4.getSeatNo());
        System.out.println(passenger5.getSeatNo());
        System.out.println(passenger6.getSeatNo());


    }


}
