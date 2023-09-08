package oop;

public class CatParent implements Animals {
    @Override
    public int legsQuantity() {
        return 4;
    }

    @Override
    public String voice() {
        return "myayyyy";
    }

    public int jumpHigh() {
        return 3;
    }
}
