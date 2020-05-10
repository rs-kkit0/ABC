package app;

import java.util.Scanner;

public class ABC145C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        System.out.println("No");

        sc.close();
    }

    private static double calc(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

}