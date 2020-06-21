// 提出時に消す
package app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

// 提出時にMainに変更する
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();

        System.out.println(a.multiply(b).setScale(0, RoundingMode.DOWN));

        sc.close();
    }
}