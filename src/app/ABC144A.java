package app;

import java.util.Scanner;

public class ABC144A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= 9 && b <= 9) {
            System.out.println(a * b);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}