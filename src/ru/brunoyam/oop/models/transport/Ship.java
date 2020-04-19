package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Ship extends Transport {
    private final boolean hasCabins;
    private final int cabinQuantity;
    private final Cabin[] cabinsArray;
    private final Passenger[] shipPassengers;

    public Ship(int travelTime, int seatsNumber, int cost, boolean hasCabins, int cabinQuantity, Cabin[] cabinsArray, Passenger[] shipPassengers) {
        super(travelTime, seatsNumber, cost);
        this.hasCabins = hasCabins;
        this.cabinQuantity = cabinQuantity;
        this.cabinsArray = cabinsArray;
        this.shipPassengers = shipPassengers;
    }
// только геттеры

    public boolean isHasCabins() {
        return hasCabins;
    }

    public Cabin[] getCabinsArray() {
        return cabinsArray;
    }

    public int getCabinQuantity() {
        return cabinQuantity;
    }

    public Passenger[] getShipPassengers() {
        return shipPassengers;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "hasCabins=" + hasCabins +
                ", cabinQuantity=" + cabinQuantity +
                ", cabinsArray=" + Arrays.toString(cabinsArray) +
                ", shipPassengers=" + Arrays.toString(shipPassengers) +
                '}';
    }
}

