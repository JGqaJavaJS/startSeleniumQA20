package org.example;

public class ExceptionsHWThrow {

    public static void main(String[] args) throws InterruptedException, ArithmeticException{
        pause(300);
        arithmeticException(9, 0); // stack trace error
    }

    public static void pause(int time) throws InterruptedException {
        Thread.sleep(time);
    }

    public static void arithmeticException(int dividend, int divider) throws ArithmeticException {
        int result = dividend/divider;
        System.out.println("result: " + result);
    }
}
