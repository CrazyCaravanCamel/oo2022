package isikukood;

public class IsikukoodLV implements IsikukoodObject {
    String isikukood;


    public IsikukoodLV(String isikukood) {
        this.isikukood = isikukood;

    }

    @Override
    public boolean isMale() {
        return false;
    }

    @Override
    public int getBirthYear() {
        return 0;
    }

    @Override
    public String getBirthMonth() {
        return null;
    }
}
