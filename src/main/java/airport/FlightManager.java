package airport;

import passenger.Passenger;

import java.util.ArrayList;

public class FlightManager {

    public int calculatePlaneReservedWeight(Plane plane){
        int weight = plane.getPlaneTotalWeight()/2;
        return weight;
    }

    public double weightOFBagPerPerson(Plane plane){
        int reserved = calculatePlaneReservedWeight(plane);
        int capacity = plane.getPlaneCapacity();
        double weight =  reserved / capacity;
        return weight;
    }

    public double totalWeightPerPerson(Plane plane, Passenger passenger){
        return weightOFBagPerPerson(plane)*passenger.getNumOfPassengerBags();
    }

//    public int totalPassengerBaggageWeight(Flight flight){
//        int totalWeight = 0;
//        for (int i = 0; i> flight.getPassengerListSize(); i ++){
//            weightPerPerson(flight.getPlane(), flight.getPassenger(i));
//        }
//
//    }
}
