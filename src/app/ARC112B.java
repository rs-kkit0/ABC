// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ARC112B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        long b = sc.nextLong();
        long c = sc.nextLong();

        long mBmin = b * -1 - (c - 1) / 2;
        long mBmax = b * -1 + (c - 1) / 2;
        long bmin = b - c / 2;
        long bmax = b + (c - 2) / 2;

        long kyoutsu = Math.max(Math.min(bmax, mBmax) - Math.max(bmin, mBmin) + 1, 0);

        long ans = bmax - bmin + 1 + mBmax - mBmin + 1 - kyoutsu;

        System.out.println(ans);

        sc.close();
    }
}