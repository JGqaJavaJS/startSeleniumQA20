package org.example;

public class ExceptionsHWTry {

    public static void main(String[] args) {
        pause(300);
        arithmeticException(9, 0);
    }

    public static void pause(int time)  {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
    }

    public static void arithmeticException(int dividend, int divider){
        try {
            int result = dividend / divider;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        }finally {
            System.out.println("finally");
        }
    }

}
