package passenger;

public class Passenger {

    private String name;
    private int numOfPassengerBags;

    public Passenger(String name, int numOfBags){
        this.name = name;
        this.numOfPassengerBags = numOfBags;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public int getNumOfPassengerBags(){
        return this.numOfPassengerBags;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setNumOfPassengerBags(int newNum){
        this.numOfPassengerBags = newNum;
    }

}
