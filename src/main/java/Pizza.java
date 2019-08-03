import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
    private List<String> listOfPizzas;

    public Pizza() {
        listOfPizzas = new ArrayList();
    }

    private void list() {
        listOfPizzas.add( "Margaritta");
        listOfPizzas.add( "Vesuvio");
        listOfPizzas.add( "Capriciosa");
        listOfPizzas.add( "Pesto");
        listOfPizzas.add( "Kebab");
        listOfPizzas.add( "Hawajska");
        listOfPizzas.add( "Margeritha di Buffala");
        listOfPizzas.add( "Rzeźnicka");
        listOfPizzas.add( "Pizza 9");
        listOfPizzas.add( "Pizza 10");

        System.out.println();

    }


    public void printMenu() {
        System.out.println("Witamy w naszej pizzerii. ");
        System.out.println("Wybierz pizze: ");
    }


}
