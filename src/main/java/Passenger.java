import java.util.Random;

public class Passenger {

    private String name;
    private int bags;
    private int seatNo;


    public Passenger(String name, int bags, int seatNo){
        this.name = name;
        this.bags = bags;
        this.seatNo = seatNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBags() {
        return bags;
    }

    public int setBags(int bags) {
       return this.bags = bags;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public int setSeatNo(int seatNo) {
        return this.seatNo = seatNo;
    }
}
