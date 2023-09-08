package oop;

public class OneMoreMainOOPLastLesson {

    public static void main(String[] args) {
        CatParent catParent = new CatParent();
        Kitty kitty = new Kitty();
        System.out.println(catParent.voice());
        System.out.println(kitty.voice());

        if(catParent instanceof Kitty) {
            System.out.println("catParent instanceof Kitty");
        } else {
            System.out.println("NOT catParent instanceof Kitty");
        }

        if(kitty instanceof CatParent) {
            System.out.println("kitty instanceof CatParent");
            kitty.some();
            System.out.println(((CatParent) kitty).voice());
            //((CatParent) kitty).some();
            kitty.some();
        } else {
            System.out.println("NOT kitty instanceof CatParent");
        }
    }
}
