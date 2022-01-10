import airport.Flight;
import airport.Plane;
import airport.PlaneType;
import crew.Pilot;
import crew.Rank;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Pilot pilot1;
    Plane plane1;
    Passenger passenger1;

    @Before
    public void setUp(){
        pilot1 = new Pilot("Sam", Rank.CAPTAIN, "PL136");
        plane1 = new Plane(PlaneType.BOEING747);
        passenger1 = new Passenger("Jimmy", 4);
        flight1 = new Flight(
                            pilot1,
                            plane1,
                            "FL004",
                            "EDI",
                            "LDN",
                            "06:00"
        );
    }

    @Test
    public void hasNumberOfSeats(){
        assertEquals(100, flight1.numOfSeatsAvailable());
    }

    @Test
    public void canBookSeat(){
        assertEquals(100, flight1.numOfSeatsAvailable());
        flight1.addPassenger(passenger1);
        assertEquals(99, flight1.numOfSeatsAvailable());
        assertEquals(1, flight1.getPassengerListSize());
    }

    @Test
    public void canCalculateTotalBaggageWeight(){
        flight1.addPassenger(passenger1);
        assertEquals(20,flight1.allPassengerBagWeight(flight1.getPassengers()),0.0);
    }

    @Test
    public void canCalculateRemainingBaggageWeight(){
        flight1.addPassenger(passenger1);
        assertEquals(480, flight1.baggageWeightRemainingOnPlane(), 0.0);
    }
}
