public enum PlaneType {

    BOEING747(5, 120);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight){

        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {

        return this.capacity;
    }

    public int getWeight() {

        return this.weight;
    }
}
