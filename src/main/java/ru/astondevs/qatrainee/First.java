package ru.astondevs.qatrainee;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = sc.nextInt();
        sc.close();

        if (number > 7) {
            System.out.println("Привет");
        }
    }
}
