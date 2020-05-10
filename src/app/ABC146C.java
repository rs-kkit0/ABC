package app;

import java.util.Scanner;

public class ABC146C {

    private static long a;
    private static long b;
    private static long x;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        x = sc.nextLong();

        long l = 0, r = 1000000001L;

        while (l + 1 < r) {
            long temp = (l + r) / 2;
            if (func(temp) <= x) {
                l = temp;
            } else {
                r = temp;
            }
        }

        System.out.println(l);
        sc.close();
    }

    private static long func(long n) {
        return a * n + b * String.valueOf(n).length();
    }
}