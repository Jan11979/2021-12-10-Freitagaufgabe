package Model;

public class BaseProdukt implements IProduct{
    String sName;
    public int iID;
    @Override
    public int getID() {
        return iID;
    }

    @Override
    public String getName() {
        return sName;
    }
    public void setName(String newName) {
        sName = newName;
    }
}
