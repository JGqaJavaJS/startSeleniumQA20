package oop;

public class SecondCastingMain {

    public static void main(String[] args) {
        Kitty kitty = new Kitty();
//        System.out.println(kitty.jumpHigh()); // 1
//        System.out.println(kitty.voice());// piii
//        System.out.println(kitty.legsQuantity()); // 4

        CatParent catFromKitty = kitty;
        System.out.println("str12 " + catFromKitty.voice()); // some not avialable
        //catFromKitty.some();
        System.out.println("str 13 " + kitty.voice() + " some " + kitty.some());

        CatParent catParent = new CatParent();
//        System.out.println(catParent.jumpHigh()); // 3
//        System.out.println(catParent.voice()); // myuuua
//        System.out.println(catParent.legsQuantity()); // 4

        catParent = kitty;
        System.out.println("str 21 " + catParent.voice());
        System.out.println("str 22 " + kitty.voice() + " " + kitty.some());

        CatParent catNewAgainFromKitty = kitty;
        System.out.println("str 25 " + catNewAgainFromKitty.voice());
        System.out.println("str 26 " + kitty.voice() + " " + kitty.some());

       // Kitty kittyCasting = (Kitty) catParent;
//        System.out.println("str 25 " + kittyCasting.voice());
//        System.out.println("str 26 " + catParent.voice());
        // error: option to get the stack trace.

        Animals animals = new Animals() {
            @Override
            public int legsQuantity() {
                return 8;
            }
        };

        System.out.println(animals.legsQuantity());
        System.out.println(animals.voice());

        Animals animalsClass = new Animals() {
            int quantity;
            public int getQuantity() {
                return quantity;
            }
            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public int someNumber() {
                return 99;
            }
            @Override
            public int legsQuantity() {
                System.out.println(someNumber());
                return 8;
            }
        };

        System.out.println(animalsClass.getClass());      // FirstMain$2
        //animalsClass.someNumber();
        System.out.println(animalsClass.legsQuantity());// 99  8

//        Animals animals1 = new Animals() {
//        };



    }

}

