package ru.brunoyam.oop.models.transport;

import java.util.Arrays;

public class Cabin {
    int cabinSeats;
    String comfortClass;
    //добавляем поле пассажиров купивших билет
    //private String[] passengers;

    public Cabin(int cabinSeats, String comfortClass){
        this.cabinSeats = cabinSeats;
        this.comfortClass = comfortClass;
        //this.passengers = passengers;
    }

    // только геттеры--------------------
    public int getCabinSeats() {
        return cabinSeats;
    }

    public String getComfortClass() {
        return comfortClass;
    }

    /*public String[] getPassengers() {
        return passengers;
    }*/

    @Override
    public String toString() {
        return "Cabin{" +
                "cabinSeats=" + cabinSeats +
                ", comfortClass='" + comfortClass + '\'' +
                //", Passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
