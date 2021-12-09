import Model.Order;
import junit.framework.TestCase;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OrderRepoTest extends TestCase {

    @Test
    public void testGetOrder() {
        OrderRepo or = new OrderRepo();

        Order orderR = null;
        Order orderN = new Order();
        orderN.setName("test 1");

        Order order = or.getOrder(1);
        assertTrue(order == null );
        or.addOrder(orderN);
        order = or.getOrder(1);
        //assertTrue(order.getID() == 1 );
        assertThat(order.getID(), equalTo(1));
        //assertTrue(order.getName().equals("test 1") == true );
        assertThat(order.getName(), is("test 1"));
    }

    @Test
    public void testAddOrder() {
        OrderRepo or = new OrderRepo();

        Order orderR = null;
        Order orderN = new Order();
        orderN.setID( 1 );
        orderN.setName(null);

        assertTrue(or.addOrder(null) == 0 );
        assertTrue(or.addOrder(orderN) == 0 );
        orderN.setName("Test1");
        assertTrue(or.addOrder(orderN) == 1 );

    }
}