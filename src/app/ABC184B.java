// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC184B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        String s = sc.next();

        for (int i = 0; i < n; i++) {
            String temp = s.substring(i, i + 1);
            if (temp.equals("x")) {
                if (x > 0) {
                    x--;
                }
            }
            if (temp.equals("o")) {
                x++;
            }
        }

        System.out.println(x);

        sc.close();
    }
}