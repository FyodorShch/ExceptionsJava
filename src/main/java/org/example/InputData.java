package org.example;

import java.util.Scanner;

public class InputData {
    public String[] data() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите через запятую с пробелом ФИО, дату рождения — dd.mm.yyyy, номер телефона, пол — f, m: ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(", ");
            if (arrayData.length == 6) {
                return arrayData;
            }
            else if (arrayData.length < 6) {
                System.out.println("Введено недостаточно данных, попробуйте снова");
            }
            else {
                System.out.println("Введено слишком много данных, попробуйте снова");
            }
        }
    }
}
