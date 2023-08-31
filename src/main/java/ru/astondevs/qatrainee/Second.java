package ru.astondevs.qatrainee;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = sc.nextLine();
        sc.close();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
