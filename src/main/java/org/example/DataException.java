package org.example;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String a) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("It's not correct format: %s", a);
        System.out.println();
    }
}
