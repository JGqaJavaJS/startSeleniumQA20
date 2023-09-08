package oop;

public class Kitty extends CatParent{

    @Override
    public String voice() {
        return "piiiiiiiii";
    }

    @Override
    public int jumpHigh() {
        return 1;
    }

    public String some() {
        some2();
        return "25 kitty";
    }

    private void some2() {
        System.out.println("some 2");
    }

}
