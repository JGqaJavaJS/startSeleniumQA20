package oop;

public interface Animals {

    public int legsQuantity();

    public default String voice() {
        return "yuyuyuyuy";
    }

}
