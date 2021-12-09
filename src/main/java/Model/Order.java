package Model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String sName;
    private int iID;
    public List<Integer> productListe;

    public Order(){
        productListe = new ArrayList<Integer>();
    }

    public int getID() {
        return iID;
    }
    public void setID(int newID) {
        iID = newID;
    }

    public String getName() {
        return sName;
    }
    public void setName(String newName) {
        sName = newName;
    }

    public void addProduct(int iID)
    {
        productListe.add(iID);
    }
}
