package sk.stuba.fei.uim.oop;

public class Priklad2_4 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 2, 8, 1, 3, 10, 78};
        int a = 0;
        while (true) {
            a = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int pomocna = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = pomocna;
                } else {
                    a++;
                }
            }
            if (a == array.length - 1) {
                for (int b = 0; b < 7; b++) {
                    System.out.println(array[b]);
                }
                break;
            }
        }
    }
}
