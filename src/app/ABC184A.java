// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC184A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(a * d - b * c);

        sc.close();
    }
}