package Test;

import Model.Car;
import Model.Parking;

public class TestParking {
    public static void main(String[] args) {
        Parking parking = new Parking("Victoria", 4);
        System.out.println(parking);
        System.out.println(parking.isFull());
        System.out.println(parking.howManyCars());


        Car car1 = new Car("5656XXX", "Ford", 2000);
        Car car2 = new Car("8989CCD", "Renault", 2020);

        System.out.println(parking.parkCar(car1));
        System.out.println(parking.parkCar(car2));
        System.out.println(parking.parkCar(car1));
        System.out.println(parking);
        System.out.println(parking.isFull());
        System.out.println(parking.howManyCars());

        System.out.println(parking.searchCar("0123FFF"));

        Car carx = parking.unParkCar("5656XXX");
        System.out.println(carx);
        System.out.println(parking);

        Car car3 = new Car("8989ZZZ", "Porche", 2023);
        System.out.println(parking.parkCar(car3));
        System.out.println(parking);

    }
}
