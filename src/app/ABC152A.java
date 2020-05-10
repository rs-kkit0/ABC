package app;

import java.util.Scanner;

public class ABC152A {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);

        if (sc.next().equals(sc.next())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}