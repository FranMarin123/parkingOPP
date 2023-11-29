import Controller.MainController;
import View.UI;

public class Main {
    public static void main(String[] args) {
        MainController.startApp(UI.readString("Inserte el nombre del parking")
                , UI.readInt("Inserte el numero de plazas"));
    }
}
