package airport;

public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    //getters
    public PlaneType getPlaneType(){
        return this.planeType;
    }

    public int getPlaneCapacity(){
        return this.planeType.getCapacity();
    }

    public int getPlaneTotalWeight(){
        return this.planeType.getTotalWeight();
    }
}
