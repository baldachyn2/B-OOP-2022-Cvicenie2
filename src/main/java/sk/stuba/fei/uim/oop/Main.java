package sk.stuba.fei.uim.oop;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";

        System.out.println("Object.equals(a,a):" + Objects.equals(a,a));
        System.out.println("Object.equals(a,b):" + Objects.equals(a,b));
    }
}
