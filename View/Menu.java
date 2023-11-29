package View;

public class Menu {
    public static int mainMenu(){
        System.out.println("Bienvenido a ParkingSoft v0.1 \n" +
                "1-Listar Coches \n" +
                "2-Cuantos coches hay \n" +
                "3-Aparcar coche \n" +
                "4-Sacar coche \n" +
                "5.Salir \n");
        return UI.readInt("Elija una opción");
    }

    public static String parkingMenuStep1(){
        return UI.readString("Inserte la matricula");
    }
    public static String parkingMenuStep2(){
        return UI.readString("Inserte el modelo");
    }

    public static int parkingMenuStep3() {
        return UI.readInt("Inserte la edad");
    }

    public static String unparkingMenuStep1(){
        return UI.readString("Inserte la matricula");
    }
}
