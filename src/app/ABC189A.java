// 提出時に消す
package app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

// 提出時にMainに変更する
// public class Main {
public class ABC189A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String c = sc.next();

        if (c.charAt(0) == c.charAt(1) && c.charAt(0) == c.charAt(2)) {
            System.out.println("Won");
        } else {
            System.out.println("Lost");
        }
        sc.close();
    }
}