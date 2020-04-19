package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Compartment;
import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

public class Train extends Transport {
    private final boolean hasCompartments;
    private final int compartmentsQuantity;
    private final Compartment[] compartmentArray;
    private final Passenger[] trainPassengers;

    public Train(int travelTime, int seatsNumber, int cost, boolean hasCompartments, int compartmentQuantity, Compartment[] compartmentArray, Passenger[] trainPassengers) {
        super(travelTime, seatsNumber, cost);
        this.hasCompartments = hasCompartments;
        this.compartmentsQuantity = compartmentQuantity;
        this.compartmentArray = compartmentArray;
        this.trainPassengers = trainPassengers;
    }
    //  только геттеры

    public boolean isHasCompartment() {
        return hasCompartments;
    }

    public int getCompartmentQuantity() {
        return compartmentsQuantity;
    }

    public Compartment[] getCompartmentArray() {
        return compartmentArray;
    }

   public Passenger[] getTrainPassengers() {
        return trainPassengers;
    }

    @Override
    public String toString() {
        return "Train{" +
                super.toString() +
                "hasCompartments=" + hasCompartments +
                ", compartmentsQuantity=" + compartmentsQuantity +
                ", compartmentArray=" + Arrays.toString(compartmentArray) +
                ", trainPassengers=" + Arrays.toString(trainPassengers) +
                '}';
    }
}



