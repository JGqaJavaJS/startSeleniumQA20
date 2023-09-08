package org.example;

public class ExceptionExample {
    public static void main(String[] args)  {
        // throws InterruptedException
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        try {
            System.out.println(9 / 3);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        } finally {
            System.out.println("finally");
        }
    }
}
