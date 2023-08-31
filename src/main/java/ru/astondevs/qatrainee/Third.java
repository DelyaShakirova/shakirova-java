package ru.astondevs.qatrainee;

import java.util.Scanner;

public class Third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Введите " + size + " чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Элементы массива, кратные 3:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
