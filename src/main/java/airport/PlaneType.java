package airport;

public enum PlaneType {

    BOEING747(100, 1000),
    AIRBUSA330(200, 500),
    CONCORDE(100, 400),
    SAAB340(600, 800);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    //getters
    public int getCapacity(){
        return this.capacity;
    }

    public int getTotalWeight(){
        return this.totalWeight;
    }

}
