package ru.brunoyam.oop;

import ru.brunoyam.oop.models.Passenger;
import ru.brunoyam.oop.models.transport.*;

/**
 * Главный класс нашего приложения.
 */
public class Appilcation {

    /**
     * Главный класс приложения
     * @param args - набор аргументов запуска приложения.
     */
    public static void main(String[] args) {
        //создаем пассажиров судна
        Passenger[] shipPassengers = new Passenger[3];
        shipPassengers[0] = new Passenger("Alex", "Gorskiy", "Petrovich", "1111 111111");
        shipPassengers[1] = new Passenger("Andrey", "Ivashov", "Inanovich", "2222 222222");
        shipPassengers[2] = new Passenger("Vladimir", "Popov", "Anatolievich", "3333 333333");

        //создаем пассажиров поезда
        Passenger[] trainPassengers = new Passenger[3];
        trainPassengers[0] = new Passenger("Igor", "Bykov", "Olegovich", "4444 444444");
        trainPassengers[1] = new Passenger("Oleg", "Melnik", "Vladimirovich", "5555 555555");
        trainPassengers[2] = new Passenger("Anton", "Orlov", "Lvovich", "6666 666666");

        //создаем пассажиров самолета
        Passenger[] planePassengers = new Passenger[2];
        planePassengers[0] = new Passenger("Mikhail", "Sokolov", "Borisovich", "7777 777777");
        planePassengers[1] = new Passenger("Boris", "Volkov", "Georgievich", "8888 888888");

        //создаем пассажиров автобуса
        Passenger[] busPassengers = new Passenger[2];
        busPassengers[0] = new Passenger("Gennadiy", "Mizin", "Antonovich", "9999 999999");
        busPassengers[1] = new Passenger("Victor", "Golubev", "Andreevich", "0000 000000");

        // выводим пассвжиров
        /*
        for (int i=0;i<passengers.length; i++) {
            System.out.println(passengers[i].getName());
            System.out.println(passengers[i].getSurname());
            System.out.println(passengers[i].getSecondName());
            System.out.println(passengers[i].getDocNumber());
            System.out.println();
        }
        */

        // создаем типы кают
        Cabin[] cabins = new Cabin[1];
        cabins[0] = new Cabin (4, "Standard");
        //cabins[1] = new Cabin (2, "Comfort");
        //cabins[2] = new Cabin (1, "Luxe");

        //создаем типы купе
        Compartment[] compartments = new Compartment[1];
        compartments[0] = new Compartment (4, "Standard");
        //compartments[1] = new Compartment (2, "Comfort");

        //создаем транспортные средства
        Transport[] allTransport;
        allTransport = new Transport[4];
        allTransport[0] = new Ship(180, 80, 16000, true, 40, cabins, shipPassengers);
        allTransport[1] = new Train(120, 2000, 3000, true, 60, compartments, trainPassengers);
        allTransport[2] = new Bus(320, 45, 3200, true, 2, busPassengers);
        allTransport[3] = new Plane(50, 4, 20000, true, planePassengers);

        //выводим все
        for (int i=0; i<allTransport.length;i++) {
            System.out.println(allTransport[i]);
        }
            /*System.out.println(allTransport[0].getCost());
        System.out.println(allTransport[0].getSeatsNumber());
        System.out.println(allTransport[0].getTravelTime());
        System.out.println(allTransport[0].has);
        System.out.println(allTransport[0].getCost());
        System.out.println(allTransport[0].getCost());*/
    }

}
