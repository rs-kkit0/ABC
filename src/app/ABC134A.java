package app;

import java.util.Scanner;

public class ABC134A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int ans = (int) (3 * Math.pow(sc.nextInt(), 2));
        System.out.println(ans);
        sc.close();
    }
}