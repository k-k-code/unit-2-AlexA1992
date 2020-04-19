package ru.brunoyam.oop.models.transport;

public class Compartment {
    int compartmentSeats;
    String comfortClass;
    //добавляем поле пассажиров купивших билет
    //private String[] Passengers;

    public Compartment(int compartmentSeats, String comfortClass){
        this.compartmentSeats = compartmentSeats;
        this.comfortClass = comfortClass;
    }

    // только геттеры--------------------

    public String getComfortClass() {
        return comfortClass;
    }

    public int getCompartmentSeats() {
        return compartmentSeats;
    }

    /*public String[] getPassengers() {
        return Passengers;
    }*/

    @Override
    public String toString() {
        return "Compartment{" +
                "compartmentSeats=" + compartmentSeats +
                ", comfortClass='" + comfortClass + '\'' +
                '}';
    }
}