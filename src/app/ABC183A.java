// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC183A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x >= 0) {
            System.out.println(x);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}