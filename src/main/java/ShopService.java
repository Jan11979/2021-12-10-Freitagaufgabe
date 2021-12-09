import Model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Erstelle eine Klasse ShopService, über die wir eine neue Order aufgeben können.
 */
public class ShopService {
    ProductRepo prodRepo;
    OrderRepo orderRepo;

    public ShopService() {
        prodRepo = new ProductRepo();
        orderRepo = new OrderRepo();
    }


    public void getOrder(int iID) {
        Order order = orderRepo.getOrder(iID);
        if (order == null)
            return;
        printProduct(order);
    }


    public int addOrder(String sName, List<Integer> productListe) {
        try {
            Order order = new Order();
            order.setName(sName);
            for (Integer lObject : productListe) {
                if (prodRepo.getIProductExist(lObject) == false)
                    throw new IllegalArgumentException("Produkt existiert nicht");
                order.addProduct(lObject);
            }
            return orderRepo.addOrder(order);
        } catch (IllegalArgumentException e) {
            System.out.println("Produkt existiert nicht");
            return 0;
        }/* catch (Exception e) {
            return 0;
        }*/
    }

    public void listOrders() {
        System.out.println(orderRepo.getListAllOrders());
    }

    public void listProducts() {
        System.out.println(prodRepo.getListAllItems());
    }


    public void printProduct(Order ordrer) {
        if (ordrer == null)
            return;
        System.out.println("----------Order-----------------------");
        System.out.println("ID:   " + ordrer.getID());
        System.out.println("Name: " + ordrer.getName());

        for (Integer lObject : ordrer.productListe) {
            printProduct(prodRepo.getIProduct(lObject));
        }
    }

    public void printProduct(IProduct iProd) {
        if (iProd == null)
            return;

        System.out.println("");
        switch (iProd.getClass().getName()) {
            case "Model.Notiz":
                System.out.println("----------Notiz-----------------------");
//                System.out.println(iProd.getID() + "\t Name: " + iProd.getName());
                Notiz notiz = (Notiz) iProd;
                System.out.println("Text= " + notiz.getNotiz());
                break;
            case "Model.Dosen":
                System.out.println("----------Dosen-----------------------");
                System.out.println("ID:   " + iProd.getID());
                System.out.println("Name: " + iProd.getName());
                Dosen dosen = (Dosen) iProd;
                System.out.println("Haltbar: " + dosen.getJahreHaltbar() + " Jahre");
                break;
            case "Model.Gemuese":
                System.out.println("----------Gemuese-----------------------");
                System.out.println("ID:   " + iProd.getID());
                System.out.println("Name: " + iProd.getName());
                Gemuese gemuese = (Gemuese) iProd;
                System.out.println("Haltbar: " + gemuese.getTageHaltbar() + " Tage");
                break;
        }
        System.out.println("---------------------------------");
        return;
    }

    public void getProduct(int iID) {
        IProduct iProd = prodRepo.getIProduct(iID);
        if (iProd == null)
            return;
        printProduct(iProd);
    }


}
