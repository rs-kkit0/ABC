// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC185B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int m = sc.nextInt();
        long t = sc.nextLong();
        long n = N;

        long[] a = new long[m];
        long[] b = new long[m];

        boolean flg = true;

        for (int i = 0; i < m; i++) {
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }

        for (int i = 0; i < m; i++) {
            if (i == 0) {
                n -= a[i];
            } else {
                n -= a[i] - b[i - 1];
            }

            if (n <= 0) {
                flg = false;
                n = 0;
            }

            n += b[i] - a[i];

            n = Math.min(n, N);
        }

        n -= t - b[m - 1];

        if (n <= 0) {
            flg = false;
            n = 0;
        }

        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}