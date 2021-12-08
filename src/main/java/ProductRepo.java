import Model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Erstelle eine Klasse ProductRepo, die eine Product Liste enthält.
 */
public class ProductRepo {
    List<IProduct> listProducts = new ArrayList<IProduct>();

    public ProductRepo() {
        createDummyProducts();
        int breakit = 0;

    }

    public boolean addProduct(IProduct product) {
        if (product == null)
            return false;

        listProducts.add(product);
        return true;
    }

    public IProduct getIProduct(int iD) {
        IProduct product = null;

        for (IProduct lObject : listProducts) {
            IProduct tProduct = (IProduct) lObject;
            if(tProduct.getID() == iD)
                return tProduct;
        }
        return product;
    }


    public String getListAllItems() {
        String retString = "";
        for (IProduct lObject : listProducts) {
            //cast needed
            IProduct tProduct = (IProduct) lObject;
            retString += "ID: " + tProduct.getID() + " - Name: " + tProduct.getName() + " \n";
        }
        retString += " \n";
        return retString;
    }

    public void createDummyProducts() {

        Dosen dose = new Dosen();
        dose.setName("Ravioli");
        dose.iID = 1;
        addProduct(dose);
        dose = new Dosen();
        dose.setName("Erbsen");
        dose.iID = 2;
        addProduct(dose);

        Gemuese gemuese = new Gemuese();
        gemuese.setName("Gurke");
        gemuese.iID = 3;
        addProduct(gemuese);

        Notiz notiz = new Notiz();
        notiz.setNotiz("Bitte mal aufräumen");
        addProduct(notiz);

        gemuese = new Gemuese();
        gemuese.setName("Salat");
        gemuese.iID = 4;
        addProduct(gemuese);
        gemuese = new Gemuese();
        gemuese.setName("Zwiebel");
        gemuese.iID = 5;
        addProduct(gemuese);

        dose = new Dosen();
        dose.setName("Bohnen");
        dose.iID = 6;
        addProduct(dose);
    }
}
