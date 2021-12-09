import Model.Dosen;
import junit.framework.TestCase;
import org.junit.Test;

public class ProductRepoTest extends TestCase {

    @Test
    public void testAddProduct() {
        ProductRepo pr = new ProductRepo();
        Dosen dose = new Dosen();
        dose.setName("Ravioli");
        dose.iID = 1;
        assertFalse(pr.addProduct(dose));
        dose.setName("RavioliXXL");
        dose.iID = 1;
        assertFalse(pr.addProduct(dose));
        dose.setName("RavioliXXL");
        dose.iID = 10;
        assertTrue(pr.addProduct(dose));
    }

    @Test
    public void testGetIProductExist() {
        ProductRepo pr = new ProductRepo();
        assertTrue(pr.getIProductExist(1));
        assertFalse(pr.getIProductExist(42));
    }

    @Test
    public void testGetIProduct() {
        ProductRepo pr = new ProductRepo();
        assertTrue(pr.getIProduct(1).getID() == 1 );
        assertTrue(pr.getIProduct(42) == null );
    }
}