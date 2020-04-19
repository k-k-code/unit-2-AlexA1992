package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

import java.util.Arrays;

/**
 * Автобус прикрепленный к определенному маршруту.
 */
public class Bus extends Transport {
    /**
     * Наличие туалета в автобусе
     */
    private final boolean hasToilet;
    /**
     * Количество остановок на маршруте
     */
    private int stopsNumber;

    //добавляем поле пассажиров купивших билет
    private final Passenger[] busPassengers;


    /**
     * Конструктор заполняющий все поля
     *
     * @param hasToilet   наличие туалет
     * @param stopsNumber количество остановок на маршруте
     * @param travelTime  время в пути
     * @param seatsNumber количество мест
     * @param cost        стоимость билета
     */
    public Bus(int travelTime, int seatsNumber, int cost, boolean hasToilet, int stopsNumber, Passenger[] busPassengers) {
        super(travelTime, seatsNumber, cost);
        this.hasToilet = hasToilet;
        this.stopsNumber = stopsNumber;
        this.busPassengers = busPassengers;
    }

    /**
     * Геттер для поля {@link #hasToilet hasToilet}
     *
     * @return наличие туалета
     */
    public boolean isHasToilet() {
        return hasToilet;
    }

    /**
     * Геттер для поля {@link #stopsNumber stopsNumber}
     *
     * @return количество остановок
     */
    public int getStopsNumber() {
        return stopsNumber;
    }

    /**
     * Сеттер для поля {@link @stopsNumber stopsNumber}
     *
     * @param stopsNumber количество остановок
     */
    public void setStopsNumber(int stopsNumber) {
        this.stopsNumber = stopsNumber;
    }

// геттер для поля Passengers
    public Passenger[] getTrainPassengers() {
        return busPassengers;
    }

    /**
     * Возвращает текстовое представление объекта
     *
     * @return текстовое представление объекта
     */

    @Override
    public String toString() {
        return "Bus{" +
                super.toString() +
                "hasToilet=" + hasToilet +
                ", stopsNumber=" + stopsNumber +
                ", busPassengers=" + Arrays.toString(busPassengers) +
                '}';
    }
}
