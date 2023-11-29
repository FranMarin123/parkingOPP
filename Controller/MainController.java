package Controller;

import Model.Car;
import Model.Parking;
import View.Menu;

public class MainController {
    /**
     * Modelo
     */
    public static Parking parking;

    public static void startApp(String nameParking, int spots) {
        parking = new Parking(nameParking, spots);
        int option = -1;
        do {
            option = Menu.mainMenu();
            mainController(option);
        } while (option != 5);
    }

    public static void mainController(int option) {
        switch (option) {
            case 1: //listar coches
                System.out.println("*************");
                System.out.println(parking);
                System.out.println("*************");
                break;
            case 2:
                int nCars = parking.howManyCars();
                if (nCars == 0) {
                    System.out.println("No hay coches");
                } else if (nCars == 1) {
                    System.out.println("Hay 1 coche");
                } else {
                    System.out.println("Hay " + nCars + " coches");
                }
                break;
            case 3:
                if (parking.isFull()) {
                    System.out.println("No hay sitio en el parking");
                } else {
                    String license = Menu.parkingMenuStep1();
                    String model = Menu.parkingMenuStep2();
                    int age = Menu.parkingMenuStep3();
                    Car carTobeInserted = new Car(license, model, age);
                    int parked = parking.parkCar(carTobeInserted);
                    if (parked == -1) {
                        System.out.println("Error al aparcar el coche");
                    } else {
                        System.out.println("Tu coche esta aparcado en la plaza " + parked);
                    }
                }
                break;
            case 4:
                String license=Menu.unparkingMenuStep1();
                Car carToBeUnparked=parking.unParkCar(license);
                if(carToBeUnparked==null){
                    System.out.println("Error al sacar el coche");
                }else {
                    System.out.println("El coche que sacamos es "+carToBeUnparked);
                }
                break;
            case 5:
                break;
            default:
                System.out.println("ERROR: Opción incorrecta");
        }
    }
}
