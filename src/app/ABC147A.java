package app;

import java.util.Scanner;

public class ABC147A {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c <= 21) {
            System.out.println("win");
        } else {
            System.out.println("bust");
        }
        sc.close();
    }
}