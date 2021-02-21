// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ARC112A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long l = sc.nextLong();
            long r = sc.nextLong();

            long ans = (r - l * 2 + 1) * (r - l * 2 + 2) / 2;

            if (r < l * 2) {
                ans = 0;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}