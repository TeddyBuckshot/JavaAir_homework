package airport;

import crew.CabinCrew;
import crew.Pilot;
import passenger.Passenger;

import java.util.ArrayList;

public class Flight {

    FlightManager flightManager = new FlightManager();

    private Pilot pilot;
    private ArrayList<CabinCrew> crew;
    private ArrayList<Passenger> passengers = null;
    private Plane plane;
    private String flightNum;
    private String destination;
    private String departFrom;
    private String departureTime;


    public Flight(Pilot pilot, Plane plane, String flightNum, String destination, String departFrom, String departureTime){
        this.pilot = pilot;
        this.crew = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departFrom = departFrom;
        this.departureTime = departureTime;
    }

    //getters
    public int getPassengerListSize(){
        return this.passengers.size();
    }

//    public Plane getPlane(){
//        return this.plane;
//    }
//
    public ArrayList getPassengers(){
        return this.passengers;
    }

    //methods
    public int numOfSeatsAvailable(){
        int numOfSeats = plane.getPlaneCapacity()-passengers.size();
        return numOfSeats;
    }

    public void addPassenger(Passenger passenger){
        if (numOfSeatsAvailable() >= 1) {
            this.passengers.add(passenger);
        }
    }

    public double allPassengerBagWeight(ArrayList passengers){
        double total=0;
        for (Passenger passenger : this.passengers){
            total = total + flightManager.totalWeightPerPerson(this.plane, passenger);
        }
        return total;
    }

    public double baggageWeightRemainingOnPlane(){
        double weight = flightManager.calculatePlaneReservedWeight(this.plane) - allPassengerBagWeight(this.passengers);
        return weight;
    }
}
