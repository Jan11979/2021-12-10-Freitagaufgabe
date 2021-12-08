import java.util.Arrays;
import java.util.List;

/**
 * Freitagsaufgabe
 * Der Auftraggeber wünscht sich einen Shop-Service, um seine Produkt-Bestellungen verwalten zu können.
 * Er möchte auf der Konsole ausgeben lassen können:
 * <p>
 * ein einzelnes Produkt
 * alle Produkte
 * Zusätzlich kann er eine neue Bestellung aufgeben. Für jede neue Bestellung möchte er die entsprechenden Produkt-Ids mitangeben.
 * Weiterhin möchte er:
 * <p>
 * sich eine einzelne Bestellung anhand ihrer id ausgeben lassen.
 * alle Bestellungen ausgeben lassen können.
 * <p>
 * Freitagsaufgabe - Tipps
 * Implementiere das Bestellsystem (natürlich mit Tests!).
 * <p>
 * Erstelle eine Klasse ProductRepo, die eine Product Liste enthält.
 * Erstelle eine Klasse OrderRepo, die eine Order Liste enthält
 * Erstelle eine Klasse ShopService, über die wir eine neue Order aufgeben können.
 * throw eine Exception, wenn nicht-existente Produkte bestellt werden
 * <p>
 * Bonus
 * Nutze für die get Methoden ein Optional
 * Nutze anstelle einer Product Klasse ein Interface und implementiere verschiedene Ausführungen
 * Schaue dir hamcrest an und nutze die hamcrest matchers in deinen Tests
 * Schaue dir an wie Klassendiagramme in UML entworfen werden.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Es Lebt!!");
        ShopService shop = new ShopService();

        shop.listProducts();

        for(int i=0; i < 99; i++  )
            shop.getProduct(i);

        List<Integer> productListe1 = Arrays.asList(1, 1, 1, 4, 5);
        shop.addOrder("Bestellung 1", productListe1);
        List<Integer> productListe2 = Arrays.asList(2, 2, 2);
        shop.addOrder("Bestellung 2", productListe2);
        List<Integer> productListe3 = Arrays.asList(2, 3, 4, 5 );
        shop.addOrder("Bestellung 3", productListe3);

        System.out.println("Bestellung");
        shop.getOrder(1);


        shop.listOrders();


        System.out.println("The End!");
    }

}
