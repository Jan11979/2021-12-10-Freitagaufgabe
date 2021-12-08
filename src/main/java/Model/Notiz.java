package Model;

public class Notiz implements IProduct{
    String sNotiz;

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public String getName() {
        return "Notiz";
    }

    public void setNotiz(String newNotiz) {
        sNotiz = newNotiz;
    }
    public String getNotiz() {
        return  sNotiz;
    }
}
