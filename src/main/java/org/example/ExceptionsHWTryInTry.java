package org.example;

public class ExceptionsHWTryInTry {

    public static void main(String[] args) {
        pause2();
        try {
            pause();
            //pause2();
        } catch (InterruptedException e) {
            System.out.println("Caught Interrupted Exception: " + e.getMessage());
        } finally {
            System.out.println("Pause function execution completed.");
        }

        tryCatchFinally();
        try {
            throwsEx();
          //  tryCatchFinally();
        } catch (Exception e) {
            System.out.println("Caught InterruptedException: " + e.getMessage());
        } finally {
            System.out.println("Divide by zero functions execution completed.");
        }
    }
    public static void pause() throws InterruptedException {
        Thread.sleep(2000);
    }
    public static void pause2()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finally");
        }
    }

    public static void throwsEx() throws ArithmeticException{
        int result = 9 / 0;
        System.out.println("Result: " + result);
    }
    public static void tryCatchFinally(){
        try {
            int result = 9 / 0;
            System.out.println("Result: " + result);
        }catch (Exception e){ // ArithmeticException
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        }finally {
            System.out.println("finally");
        }
    }

}
