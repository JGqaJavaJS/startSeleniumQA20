package oop;

public class AbstractMain {

    public static void main(String[] args) {
        AbstractExample abstractExample = new AbstractExample() {
            @Override
            public int legsQuantity() {
                return 8;
            }
        };

        DogExtendsAbstract dogExtendsAbstract = new DogExtendsAbstract();


    }
}
