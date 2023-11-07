package org.example;

public class SexException extends Exception{
    public SexException() {
    }

    public void sexException(String a) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("It`s not correct data: %s", a);
        System.out.println();
    }
}
