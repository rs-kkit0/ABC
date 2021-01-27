// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC189B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt() * 100;
        int result = -1;
        int x = 0;
        for (int i = 0; i < N; i++) {
            x += sc.nextInt() * sc.nextInt();
            if (x > X) {
                result = ++i;
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}