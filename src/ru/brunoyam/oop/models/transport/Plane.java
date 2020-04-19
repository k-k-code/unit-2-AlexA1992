package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

/**
 * Авиатранспорт (самолет) прикрепленный к определенному авиамаршруту
 */
public class Plane extends Transport {
    /**
     * Багаж включен в стоимость билета
     */
    private final boolean luggage;

    //добавляем поле пассажиров купивших билет
    private final Passenger[] planePassengers;

    /**
     * Конструктор, заполняющий все поля.
     * @param travelTime время в пути
     * @param seatsNumber количество мест
     * @param cost стоимость билета
     * @param luggage багаж включен в стоимость билета
     */
    public Plane(int travelTime, int seatsNumber,
                 int cost, boolean luggage, Passenger[] planePassengers) {

        super(travelTime, seatsNumber, cost);
        this.luggage = luggage;
        this.planePassengers = planePassengers;
    }
// только геттеры -----------------------------
    public boolean isLuggage() {
        return luggage;
    }

    public Passenger[] getPlanePassengers() {
        return planePassengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "luggage=" + luggage +
                ", planePassengers=" + Arrays.toString(planePassengers) +
                '}';
    }
}
