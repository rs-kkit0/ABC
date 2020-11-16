// 提出時に消す
package app;

import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC183B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double sx = sc.nextDouble();
        double sy = sc.nextDouble();
        double gx = sc.nextDouble();
        double gy = sc.nextDouble();

        double x = (sx * gy + gx * sy) / (sy + gy);

        System.out.println(x);

        sc.close();
    }
}