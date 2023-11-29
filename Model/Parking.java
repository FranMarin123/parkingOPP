package Model;

import java.util.Arrays;
import java.util.Objects;

public class Parking {
    private String name;
    private Car[] cars;

    public Parking(String name, int tam) {
        this.name = name;
        if (tam < 0) {
            tam = 2;
        }
        this.cars = new Car[tam];
    }

    public Parking() {
        this("Genérico", 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    public boolean isFull() {
        return howManyCars() == cars.length;
    }

    public int howManyCars() {
        int result = 0;
        for (Car car : this.cars) {
            if (car != null) {
                result++;
            }
        }
        return result;
    }

    public int searchCar(String license) {
        int pos = -1;
        for (int i = 0; i < cars.length && pos == -1; i++) {
            if (cars[i] != null) {
                if (cars[i] != null && cars[i].getLicense().equals(license)) {
                    pos = i;
                }
            }
            /*
            if (cars[i] != null && cars[i].getLicense().equals(license)) {
                pos = i;
            }
             */
        }
        return pos;
    }

    public int parkCar(Car car) {
        int pos = -1;
        if (!isFull() && searchCar(car.getLicense())==-1) {
            for (int i = 0; i < cars.length && pos == -1; i++) {
                if (cars[i] == null) {
                    cars[i] = car;
                    pos = i;
                }
            }
        }

        return pos;
    }

    public Car unParkCar(String license) {
        Car car = null;
        int pos = searchCar(license);
        if (pos > -1) {
            car = cars[pos];
            cars[pos] = null;
        }
        return car;
    }

}
