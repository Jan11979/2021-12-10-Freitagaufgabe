import Model.IProduct;
import Model.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Erstelle eine Klasse OrderRepo, die eine Order Liste enthält
 *
 */

public class OrderRepo {
    ArrayList<Order> listOrder = new ArrayList<Order>();
    int iLastOrderID;
    public OrderRepo(){
        iLastOrderID = 0;
    }

    public String getListAllOrder() {
        return "JaJa";
    }
    public Order getOrder(int iD) {
       for (Order lObject : listOrder) {
           Order tOrder = (Order) lObject;
            if(tOrder.getID() == iD)
                return tOrder;
        }
        return null;
    }
    public int addOrder(Order order) {
        if (order == null)
            return 0;
        if (order.getName() == null)
            return 0;

        iLastOrderID += 1;
        order.setID( iLastOrderID );
        listOrder.add(order);
        return order.getID();
    }

    public String getListAllOrders() {
        String retString = "";
        for (Order lObject : listOrder) {
            //cast needed
            Order order = (Order) lObject;
            retString += "ID: " + order.getID() + " - Name: " + order.getName() + " \n";
        }
        retString += " \n";
        return retString;
    }
}