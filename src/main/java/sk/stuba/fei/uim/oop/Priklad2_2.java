package sk.stuba.fei.uim.oop;

import java.util.Scanner;

public class Priklad2_2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Zadaj 10 cisel");
        for (int i = 0; i < 10; i++) {
            array[i] = keyboard.nextInt();
        }

        for (int i = 0; i < 10;i++){
            System.out.println(array[i]);
        }
    }
}
