package app;

import java.util.Scanner;

public class ABC143A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(a - 2 * b, 0));

        sc.close();
    }
}