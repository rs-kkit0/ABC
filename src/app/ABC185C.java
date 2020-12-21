// 提出時に消す
package app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC185C {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();

        System.out.println(calc(l - 1, 11));
        sc.close();
    }

    public static long calc(int a, int b) {
        long ret = 1;

        for (int i = 0; i < b; i++) {
            ret *= a - i;
            ret /= i + 1;
        }

        return ret;
    }
}